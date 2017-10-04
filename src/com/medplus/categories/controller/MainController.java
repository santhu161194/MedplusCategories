package com.medplus.categories.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.medplus.categories.beans.CategoryModel;
import com.medplus.categories.beans.Login;
import com.medplus.categories.beans.ProductModel;
import com.medplus.categories.dao.impl.CategoryDaoImpl;
import com.medplus.categories.dao.impl.LoginDaoImpl;
import com.medplus.categories.dao.impl.ProductDaoImpl;
import com.medplus.categories.utils.Validation;



@Controller

public class MainController {

	@Autowired
	Validation validation;
	@Autowired
	Login login;
	@Autowired
	LoginDaoImpl dao;
	@Autowired
	ProductModel product;
@Autowired
	CategoryModel category;
	@Autowired
	ProductDaoImpl dao1;
	@Autowired
	CategoryDaoImpl dao2;

	
	//getting loginform
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getLoginForm(){
		ModelAndView mav=new ModelAndView();
		
		mav.addObject(login);
		mav.setViewName("Login");
		return mav;
	}

	//Logging in
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("login") Login login,BindingResult result){
		ModelAndView mav=new ModelAndView();
		validation.validate(login, result);
		
		String msg=null;
		if(result.hasErrors()){
			mav.setViewName("Login");
			return mav;
		}
		 login=dao.Validate(login.getUsername(),login.getPassword());
		if(login==null)
		{

			mav.setViewName("Login");
			mav.addObject("status","Invalid Credentials");
		}
		else
		{
			mav.addObject("msg", msg);
			mav.addObject("username",login.getUsername());
			/*mav.addObject("status","yes");*/
			mav.setViewName("home");
		}
		return mav;
	}


	//getting product adding form
	@RequestMapping(value="/addproduct",method=RequestMethod.GET)
		public ModelAndView getProductForm(){
			
			ModelAndView mav=new ModelAndView();
			mav.addObject(product);
			mav.setViewName("Product");
			return mav;
	}



	//Adding Product
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public ModelAndView addProduct( @ModelAttribute("productModel") ProductModel prod){
		ModelAndView mav=new ModelAndView();
		
		int rows=0;
		rows = dao1.createProduct(prod);
		if(rows>0){
		
		//dao2.catalogaddtocatalog
		//add to category
			return new ModelAndView("redirect:/viewEmpls");}
		else
		/*	msg="failed";
		*/
		/*mav.addObject("msg", msg);
		*/return mav;
	}

	
	//getting category adding form
		@RequestMapping(value="/addcategory",method=RequestMethod.GET)
			public ModelAndView getCategoryForm(){
				
				ModelAndView mav=new ModelAndView();
				mav.addObject(category);
				mav.setViewName("Category");
				return mav;
		}
	
	
	
	
	
	
	//Adding Category
		@RequestMapping(value="/addcategory",method=RequestMethod.POST)
		public ModelAndView addProduct( @ModelAttribute("categoryModel") CategoryModel cat){
			ModelAndView mav=new ModelAndView();
			
			int rows=0;
			rows =dao2.createCategory(cat); 
			if(rows>0){
			
			//dao2.catalogaddtocatalog
			//add to category
				return new ModelAndView("redirect:/viewCats");}
			else
			/*	msg="failed";
			*/
			/*mav.addObject("msg", msg);
			*/return mav;
		}
	
	
}

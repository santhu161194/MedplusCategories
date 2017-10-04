package com.medplus.categories.utils;

public class Queries {

//Database tables
//	create table ProductModel(productId varchar(30),productName varchar(30),manufacturer varchar(30),dateOfExpiry date,price double);

	
//create table CategoryModel(categoryId varchar(30),categoryName varchar(30),numberOfSubCategories int(10),numberOfProducts int(10));

	
	
	
		public static String addProduct="insert into ProductModel values(?,?,?,?,?)";
		public static String updateEmployee="update Employee set fname=?,lname=?,job=?,dateofjoin=?,salary=?,deptno=? where code=?";
		public static String deleteEmployee="delete from Employee where code=?";
		public static String getEmployees="select * from Employee";
		public static String getEmployee="select * from Employee where  code=?";
		
		public static String addDepartment="insert into Department values(?,?,?)";
		public static String updateDepartment="update Department set deptname=?,location=? where deptno=?";
		public static String deleteDepartment="delete from Department where deptno=?";
		public static String getDepartments="select * from Department";
		public static String getDepartment="select * from Department where  deptno=?";
		public static String getDeptEmployees="select * from Employee where deptno=?";
		
		public static String getUserData="select * from Login where userid=?";
		public static String createUserLogin="insert into Login values(?,?,?)";
		public static String deleteUserLogin="delete from Login where userid=?";
		public static String updatePassword="update Login set password=? where userid=?";
		public static String getDateofJoin="select dateofjoin from Employee where empcode=?";
	
	
	
}

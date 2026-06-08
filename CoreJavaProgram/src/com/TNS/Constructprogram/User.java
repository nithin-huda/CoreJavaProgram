package com.TNS.Constructprogram;


	
	class User1{
	        String name;
	        int age;
	        boolean  value;
	        //Default const
	        User1(){
	                name="Guest person";
	                age=5;
	                System.out.println("Guest profile created");
	        }
	        //parameter const
	        
	        User1(String name,int age){
	                this.name=name;
	                this.age=age;
	                System.out.println("User creaed :"+"name "+ name +"|| "+ "Age :"+age);
	        }
	        User1 (String name, boolean value){
	        	this.name=name;
	        	this.value=value;
	        	System.out.println("User created: Name = " + name +" ||"+ " value = " + value);
	        }
	}
	public class User {
	public static void main(String[] args) {
	        User1 u=new User1();
	        User1 u1=new User1("Niteenkumar",21);
	        User1 u2=new User1("Niteen",true);
	}
	}
	

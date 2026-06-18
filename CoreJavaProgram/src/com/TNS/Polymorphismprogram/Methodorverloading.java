package com.TNS.Polymorphismprogram;

	class Calculator{
	int add(int a,int b) {
	                return a+b;
	                
	        }
	        double add(double c,double d) {
	                return c+d;
	                
	        }
	        int add(int a,int b,int h) {
	                return a+b+h;
	                
	        }
	        int sub(int a ,int b, int c,int d) {
	        	return a*b-c+d;
	        }
	}
	public class Methodorverloading {
	public static void main(String[] args) {
	        Calculator c=new Calculator();
	        System.out.println(c.add(3.2, 4.5));
	        System.out.println(c.add(1, 4));
	        System.out.println(c.add(1, 2, 3));
	        System.out.println(c.add(5.2, 4.7));
	        System.out.println(c.sub(4, 5, 10, 7));
	}
	}



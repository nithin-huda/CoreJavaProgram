package com.TNS.Scannerclassprogarm;


	
	import java.util.Scanner;

	public class personexec {
	        public static void main(String[] args) {
	                
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the person name");
	String name=sc.nextLine();
	System.out.println("enter the income");
	int income=sc.nextInt();

	person pp=new person(); //object
	pp.setName(name);
	pp.setIncome(income);

	Taxcalculation t=new Taxcalculation(); // object
	t.calculatetax(pp);

	System.out.println("after tax calculation ");
	System.out.println(pp);


	}
	}

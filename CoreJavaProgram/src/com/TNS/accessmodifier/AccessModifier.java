package com.TNS.accessmodifier;

public class AccessModifier {
public int n=116;// data member
private  String m="Niteenkumar";

	char A='N';
	protected int s=10;
	public void display() {// function or method or member function
		System.out.println("Hi friends");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    AccessModifier D= new AccessModifier();
    System.out.println(D.A);
    System.out.println(D.n);
System.out.println(D.m);
System.out.println(D.s);

	}

}

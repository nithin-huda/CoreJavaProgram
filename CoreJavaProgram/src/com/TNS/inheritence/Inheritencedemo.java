package com.TNS.inheritence;


	
	//demo for inheritance
	class Father{
	        int money=100000;
	        String car="bmw";
	        
	        void drinking() {
	                System.out.println("coldcoffe");
	        }
	}
	class Son extends Father{
	        String cycle="Blue";
	        
	        void read() {
	                System.out.println("corejava");
	        }
	}
	public class Inheritencedemo {
		
	public static void main(String[] args) {
	        Father f=new Father();
	        f.drinking();
	        Son s=new Son();
	        System.out.println(s.money);
	        System.out.println(s.car);
	        s.drinking();
	        System.out.println(s.cycle);
	        s.read();
	}
	}
	


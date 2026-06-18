package com.TNS.Staticandfinal;

public class Empolyee {
	
	        int eid;
	        String name;
	        static String companyname="TNS";
	        
	        // constructor
	        
	        Empolyee(int e,String n){
	                eid=e;
	                name=n;        
	        }
	        void display() {
	                System.out.println(eid+" "+name+" "+companyname);
	        }
	        public static void main(String[] args) {
	                Empolyee e1=new Empolyee(1,"Niteen");
	                Empolyee e2=new Empolyee(2,"kumar");
	                
	                e1.display();
	                e2.display();
	        }

	
}

package com.TNS.Staticandfinal;


	public class Student {
	        int rollno;
	        String name;
	      static   String name1;
	         static String College="ACS COLLEGE OF ENGINEERING";
	        
	        //static method change value
	        
	        static void Change() {
	                name1= "students";
	                College="ACS";
	        }
	        Student(int r, String n){
	                rollno=r;
	                name=n;
	        }
	        void display() {
	                System.out.println(rollno +" "+name+ "  "+College+" "+ name1);
	        }
	        public static void main(String[] args) {
	                Student.Change();
	                Student  s1=new Student (1,"Niteen");
	                Student  s2=new Student (2,"manasa");
	                Student  s3=new Student (3,"prashanth G");
	                Student  s4=new Student (4,"prashanthaa");
	                
	                s1.display();
	                s2.display();
	                s3.display();
	                s4.display();
	                
	        }
	}
	


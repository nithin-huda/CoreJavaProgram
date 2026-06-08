package com.TNS.encapsulation;

public class Encapsulationprogram {
int serialnumber;//properties or data member
String name;// Declaration
int age;
char n;
   void show() {  // member function 
       System.out.println(serialnumber +" "+name+" "+age+" "+ n);
        }
        
        public static void main(String[] args) {
                Encapsulationprogram e=new Encapsulationprogram();
                e.n='N';
                e.serialnumber=20;
                e.name="Niteenkumar";
                e.age=21;
                System.out.println(" It was example for encapsulation");
                System.out.println("first it will check main method in that if object is called then it"
                		+ " will go to public class to properties if there only instance variables(data members)");
                e.show();
        }
}



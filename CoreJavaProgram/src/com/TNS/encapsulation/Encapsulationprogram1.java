package com.TNS.encapsulation;

public class Encapsulationprogram1 {
	  // properties
	        private int id;
	        private String name;
	        
	        
	        //getter and setter method
	        
	        public int getId() {
	                return id;
	        }
	        public void setId(int id) {
	                this.id = id;
	        }
	        
	        public String getName() {
	                return name;
	        }
	        public void setName(String name) {
	                this.name = name;
	        }
	        
	        public static void main(String[] args) {
	                Encapsulationprogram1 e1=new Encapsulationprogram1();
	                
	                //setting the value using setters
	                e1.setId(116);
	                e1.setName("Niteenkumar");
	                
	                //getting the values using getters
	                System.out.println(e1.getId());
	                System.out.println(e1.getName());
	        }
	        
	        
	}


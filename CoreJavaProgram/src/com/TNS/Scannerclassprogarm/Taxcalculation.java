package com.TNS.Scannerclassprogarm;

public class Taxcalculation {
 void calculatetax(person p) {
	                
	                if(p.getIncome()<=2000) {
	                        p.setTax(0);
	                }
	                else if(p.getIncome()>=2000&&p.getIncome()<=50000) {
	                        p.setTax(5);
	                }
	                else {
	                        p.setTax(10);
	                }
	        }
	}

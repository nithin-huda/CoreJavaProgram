package com.TNS.Superkeyword;


	//demo for super variable

	class Supervariable{
	        String message="Default notification";
	}

	class Pushnotification extends Supervariable{
	        String message="push notification from whstp";
	        void notification() {
	                System.out.println("child message :"+message);
	                System.out.println("parent message :"+super.message);
	        }
	}

	public class Notification  {
	        public static void main(String[] args) {
	                Pushnotification p=new Pushnotification();
	                p.notification();
	        }

	}


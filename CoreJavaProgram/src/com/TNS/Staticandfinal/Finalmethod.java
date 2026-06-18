package com.TNS.Staticandfinal;

class Father {
    int a = 90;

    final void display() {
        System.out.println("welcome to java");
    }
}

public class Finalmethod extends Father {

    public static void main(String[] args) {
        Finalmethod obj = new Finalmethod();
        obj.display();
       
      
            System.out.println("Welcome to Python");
    }
}
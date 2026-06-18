package com.TNS.Strings;
// demo for == operator
public class EqualOperator {
        public static void main(String[] args) {
                String s1="Niteen";
                String s2="Niteen";
                String s3=new String("Niteen");
                String s4="Niteen";
                System.out.println(s1==s2);
                System.out.println(s1==s3);
                System.out.println(s2.equals(s3));
                System.out.println(s1==s4);
        }

}

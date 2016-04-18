package com.java.ch05;
public class Str{
public static void main(String args[]){
String s=new String("we,are,goodstudent");
String y=new String("jiushizheyang");
System.out.println(s+"   "+y);
System.out.println(s.length());
System.out.println(y.length());
int size1=s.indexOf("e");
int size2=y.indexOf("e");
System.out.println(size1);
System.out.println(size2);
int size3=s.lastIndexOf("e");
int size4=y.lastIndexOf("e");
System.out.println(size3);
System.out.println(size4);
char size5=s.charAt(9);
char size6=y.charAt(4);
System.out.println(size5);
System.out.println(size6);
String size7=s.substring(2);
String size8=y.substring(2);
System.out.println(size7);
System.out.println(size8);
String size9=s.substring(2,6);
String size10=y.substring(2,8);
System.out.println(size9);
System.out.println(size10);
System.out.println(s.length());
System.out.println(s.trim().length());
String size11=s.replace("s","W");
String size12=y.replace("s","H");
System.out.println(size11);
System.out.println(size12);
boolean b=y.startsWith("ji");
System.out.println(b);
boolean b1=y.equals(s);
System.out.println(b1);
boolean b2=y.equalsIgnoreCase(s);
System.out.println(b2);
int b3=y.compareTo(s);
System.out.println(b3);
System.out.println(s.toLowerCase());
System.out.println(y.toUpperCase());




}



}


}
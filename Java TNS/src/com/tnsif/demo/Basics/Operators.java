package com.tnsif.demo.Basics;
import java.util.*;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Arithmetic Operators");
		System.out.println("Addition "+(a+b));
		System.out.println("Subraction "+(a-b));
		System.out.println("Multiplication "+(a*b));
		System.out.println("Divison "+(a/b));
		System.out.println("Modulus "+(a%b));
		System.out.println("Unary Operators");
		System.out.println("a++: " + (a++));    
		System.out.println("++a: " + (++a));    
		System.out.println("!True: " + !(true)); 
		System.out.println("Assignment Operators");
		System.out.println("a after += 5: " + (a+=5)); 
		System.out.println("n after *= 2: " + (a*=2)); 
		System.out.println("Relational Operators");
		System.out.println("a > b: " + (a > b));   
		System.out.println("a == b: " + (a == b)); 
		System.out.println("a != b: " + (a != b));
		System.out.println("Logical operators");
		boolean p = true, q = false;
		System.out.println("p && q: " + (p && q)); 
		System.out.println("p || q: " + (p || q)); 
		System.out.println("!p: " + (!p)); 
		System.out.println("Ternery operator");
		System.out.println((a>b)?"a is greater":"b is greater"); 
		



	}

}

package com.acadgild.aatika.java.session5;
import java.util.Scanner;
public interface InterfaceExample {
	
	int print();

}

class Interface2 implements InterfaceExample {
	Scanner s = new Scanner(System.in);
	int a;
	
	public int print()
	{
		System.out.println("Enter your value");
		a=s.nextInt();
		
		System.out.println("You have entered : "+a);
		return a;
	}
}

class interface3 extends Interface2{
	
	public int print1(){
		
		int sqr = a*a;
		System.out.println("The square of your value is : "+sqr);
		return sqr;
		
	}
}

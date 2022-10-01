//07.	Write a program to swap two numbers without using third variable.

import java.util.Scanner;

class A07{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.print(b);
	}
}
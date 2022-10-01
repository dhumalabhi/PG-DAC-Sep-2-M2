/*
06.	Write a program to convert temperature from Fahrenheit to Celsius.
Take Fahrenheit as input using Scanner class.
[ formula : C= 5*(f-32)/9 ]
*/

import java.util.Scanner;

class A06{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a temprature in Fahrenheit");
		float fr=sc.nextFloat();
		float cels=5*(fr-32)/9.0f;
		System.out.println("Temprature in celsius"+cels);
	}
}
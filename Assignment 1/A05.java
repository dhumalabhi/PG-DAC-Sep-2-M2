/*
05.	Write a program to read the days (eg. 670 days)
as integer value using Scanner class.
Now convert the entered days into complete years,
months and days and print them.
*/

import java.util.Scanner;

class A05{
	static int year(int days){
		return days/365;
	}
	static int month(int days){	
		return days%365/30;
	}
	static int days(int days){
		return days%365%30;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of Day's");
		int days=sc.nextInt();
		System.out.print("Total Year's: "+year(days));
		System.out.print(", Total Month's: "+month(days));
		System.out.print(", Toatal Day's: "+days(days));
	}
}
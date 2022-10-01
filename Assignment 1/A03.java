/*
03.	Write a program to calculate sum of 5 subject’s marks & find percentage.
Take the obtained marks from user using Scanner class.
Output should be in this format [ percentage marks = 99 % ].
Use concatenation operator here.
*/

import java.util.Scanner;

class A03{
	static float percentage(int s1, int s2, int s3, int s4, int s5){
		int sum=s1+s2+s3+s4+s5;
		
		float per=(sum/5.0f);
		
		return per;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st subject marks");
		int s1=sc.nextInt();
		System.out.println("Enter a 2nd subject marks");
		int s2=sc.nextInt();
		System.out.println("Enter a 3rd subject marks");
		int s3=sc.nextInt();
		System.out.println("Enter a 4th subject marks");
		int s4=sc.nextInt();
		System.out.println("Enter a 5th subject marks");
		int s5=sc.nextInt();
		System.out.print("Percentage marks = "+percentage(s1,s2,s3,s4,s5)+"%");
	}
}
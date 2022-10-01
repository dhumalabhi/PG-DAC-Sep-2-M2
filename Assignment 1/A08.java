/*
08.	In a company an employee is paid as under:
	If his basic salary is less than Rs. 10000,
	then HRA = 10% of basic salary and DA = 90% of basic salary.
	If his salary is either equal to or above Rs. 10000,
	then HRA = Rs. 2000 and DA = 98% of basic salary.
	If the employee's salary is input by the user write a program to find his gross salary.
[ formula : GS= Basic + DA + HRA ]
*/

import java.util.Scanner;

class A08{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a basic salary of employee");
		double gs=0;
		double basicSalary=sc.nextInt();
		if(basicSalary<10000){
			gs=basicSalary+basicSalary*90/100+basicSalary*10/100;
		}else{
			gs=basicSalary+2000+basicSalary*98/100;
		}System.out.println(gs);
	}
}
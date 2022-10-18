/*
2. Write a class for "Account" containing data members 'accountNumber', 'holderName', 'balance' and add 
constructors and necessary accessor/modifier functions for these data members. Now create two class 
"SavingsAccount" and "CurrentAccount" extending from this class. SavingsAccount will have a member 
variable 'interestRate' and member function 'calculateYearlyInterest'. Write another class "Manager" that 
contains a list Account. Also write a main() function to create an instance of Manager class. Add two 
SavingsAccount and three CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print 
the details of all accounts.


@author-Abhijeet Ramesh Dhumal
*/


abstract class Account{
	
	int accountNumber;
	String holderName;
	double balance;
	
	Account(){
		
	}
	
	Account(int accountNumber,String holderName,double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	
	void printAccountDetails(){
		System.out.println("Account Number is: "+accountNumber);
		System.out.println("Account holder name is: "+holderName);
		System.out.println("Account balance is: "+balance);
		System.out.println(" ========================================/n ");
	}
	
	abstract void calculateYearlyInterest();
}
class SavingsAccount extends Account{
	SavingsAccount(int accountNumber,String holderName,double balance){
		super(accountNumber,holderName,balance);
	}
	
	static double interest=4.5;
	
	void calculateYearlyInterest(){
		System.out.println("Account number is: "+accountNumber);
		System.out.println("Yearly interest of these saving Account  is: "+balance/100*interest);
		System.out.println(" ========================================/n ");
	}
}
class CurrentAccount extends Account{
	static double interest=5.0;
	
	void calculateYearlyInterest(){
		System.out.println("Account number is: "+accountNumber);
		System.out.println("Yearly interest of these current Account is: "+balance/100*interest);
	}
	
	CurrentAccount(int accountNumber,String holderName,double balance){
		super(accountNumber,holderName,balance);
	}
}
class Manager{
	
	static int count=0;
	Account[] list;
	
	Manager(){
		list =new Account[5];
	}
	
	Manager(int n){
		list =new Account[n];
	}
	
	void addSaving(int accountNumber,String holderName,double balance){
		list[count++]=new SavingsAccount(accountNumber,holderName,balance);
	}
	
	void addCurrent(int accountNumber,String holderName,double balance){
		list[count++]=new CurrentAccount(accountNumber,holderName,balance);
	}
	
	void printAllAcountDetails(){
		for(Account a: list){
			a.printAccountDetails();
		}
	}
	
	void printAllAcountInterest(){
		for(Account a: list){
			a.calculateYearlyInterest();
		}
	}
	
}
public class Main2{
	public static void main(String[] args){
		Manager m1=new Manager(5);

		m1.addSaving(123456,"Abhijeet Dhumal",234567.50);
		m1.addSaving(123457,"Akash Dhumal",234457.);
		m1.addSaving(123458,"Aditya Dhumal",233467);
		m1.addCurrent(123459,"Abhijeet Dhumal",23454.90);
		m1.addCurrent(123460,"Akash Dhumal",2723);
		m1.printAllAcountDetails();
		System.out.println(" ========================================/n ");
		m1.printAllAcountInterest();	
	}
}


/*

OUTPUT:


C:\Users\dhuma\Desktop\C-DAC\Module 2\Assignment 3>java Main2
Account Number is: 123456
Account holder name is: Abhijeet Dhumal
Account balance is: 234567.5
 ========================================/n
Account Number is: 123457
Account holder name is: Akash Dhumal
Account balance is: 234457.0
 ========================================/n
Account Number is: 123458
Account holder name is: Aditya Dhumal
Account balance is: 233467.0
 ========================================/n
Account Number is: 123459
Account holder name is: Abhijeet Dhumal
Account balance is: 23454.9
 ========================================/n
Account Number is: 123460
Account holder name is: Akash Dhumal
Account balance is: 2723.0
 ========================================/n
 ========================================/n
Account number is: 123456
Yearly interest of these saving Account  is: 10555.5375
 ========================================/n
Account number is: 123457
Yearly interest of these saving Account  is: 10550.565
 ========================================/n
Account number is: 123458
Yearly interest of these saving Account  is: 10506.015
 ========================================/n
Account number is: 123459
Yearly interest of these current Account is: 1172.7450000000001
Account number is: 123460
Yearly interest of these current Account is: 136.15

C:\Users\dhuma\Desktop\C-DAC\Module 2\Assignment 3>


*/
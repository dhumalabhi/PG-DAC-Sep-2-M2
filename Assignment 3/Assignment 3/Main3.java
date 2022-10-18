/*
3. Implement a class for a Person. Person has data members age, weight, height, dateOfBirth, 
address with proper reader/write methods etc. Now create two subclasses Employee and Student. 
Employee will have additional data member salary, dateOfJoining, experience etc. Student has data 
members roll, listOfSubjects, their marks and methods calculateGrade. Again create two sub-classes 
Technician and Professor from Employee. Professor has data members courses, listOfAdvisee and 
their add/remove methods. Write a main() function to demonstrate the creation of objects of different 
classes and their method calls. 
*/

abstract class Person{
	private int age;
	private double weight;
	private String dateOfBirth;
	private String address;
	Person(){}
	Person(int age,double weight, String dateOfBirth, String address){
		this.age=age;
		this.weight=weight;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
	}
	abstract void name();
	void read(){
		name();
		System.out.println("Age of Person is: "+age);
		System.out.println("Weight of Person is: "+weight);
		System.out.println("Date of Birth of Person is: "+dateOfBirth);
		System.out.println("Address of Person is: "+address);
	}
	void write(int age,double weight, String dateOfBirth, String address){
		this.age=age;
		this.weight=weight;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
	}
}

class Employee extends Person{
	Employee(){}
	Employee(int age,double weight, String dateOfBirth, String address,double salary, String dateOfJoining, int experience){
		super(age, weight, dateOfBirth, address);
		this.salary=salary;
		this.dateOfJoining=dateOfJoining;
		this.experience=experience;
	}
	void name(){
		System.out.println("This is Employee");
	}
	private double salary;
	String dateOfJoining;
	int experience;
}
class Student extends Person{
	Student(){}
	Student(int age,double weight, String dateOfBirth, String address,int roll, Subject[] subject ){
		super(age, weight, dateOfBirth, address);
		this.roll=roll;
		this.subject=subject;
	}
	void name(){
		System.out.println("This is Student");
	}
	int roll;
	Subject[] subject;
	void calculateGrade(){
		int totalMarks=0;
		for(int i=0;i<subject.length;i++){
			totalMarks+=subject[i].marks;
		}
		totalMarks/=subject.length;
		if(totalMarks>75){
			System.out.println("Gred is First class with distiction");
		}else if(totalMarks>60){
			System.out.println("Gred is First class");
		}else if(totalMarks>40){
			System.out.println("Gred is secound class");
		}else{
			System.out.println("Failed");
		}
	}	
}
class Subject{
	Subject(){}
	Subject(String name, double marks){
		this.name=name;
		this.marks=marks;
	}
	String name;
	double marks;
}

class Professor extends Employee{
	class ListOfAdvisee{
		int no;
		static int count=0;
		String advisee;
		ListOfAdvisee(){}
		ListOfAdvisee(int n,String str){no=n;advisee=str;}
		void listOfAdvisee(int n,String str){
			listOfAdvisee[count++]=new ListOfAdvisee(n,str);
		}
		void print(){
			System.out.println(no+" "+advisee);
		}
	}
	void name(){
		System.out.println("This is Professor");
	}
	void listOfAdvisee(){
		System.out.println("-----------List of Advisee is----------");
		for(int i=0;i<ListOfAdvisee.count;i++){
			listOfAdvisee[i].print();
		}
	}
	private String []courses;
	ListOfAdvisee[] listOfAdvisee=new ListOfAdvisee[10];
	
	void addAdvisee(int no,String advisee){
		listOfAdvisee[ListOfAdvisee.count++]=new ListOfAdvisee(no,advisee);
	}
	void removeAdvisee(int n){
		for(int i=n;i<ListOfAdvisee.count;i++){
			listOfAdvisee[i]=listOfAdvisee[i+1];
		}
		ListOfAdvisee.count--;
	}
	void removeListOfAdvisee(int no){
		for(int i=0;i<ListOfAdvisee.count; i++){
			if(listOfAdvisee[i].no==no){
				removeAdvisee(i);
			}
		}
	}
	Professor(){}
	Professor(int age,double weight, String dateOfBirth, String address,double salary, String dateOfJoining, int experience, String[] courses){
		super(age, weight, dateOfBirth, address,salary,dateOfJoining,experience);
		this.courses=courses;
	}	
}
class Technician extends Employee{
	Technician(){}
	Technician(int age,double weight, String dateOfBirth, String address,double salary, String dateOfJoining, int experience){
		super(age, weight, dateOfBirth, address,salary,dateOfJoining,experience);
	}
	void name(){
		System.out.println("This is Technician");
	}
}
public class Main3{
	public static void main(String[] args){
		System.out.println();
		/*
		Person p=new Person();
		p.write(45,70,"31/03/1978","Mumbai");
		p.read();
		System.out.println("==================================================\n");
		*/

		Subject[] arr={new Subject("Marathi",83), new Subject("English",78),new Subject("Math",90), new Subject("History",84)};
		Student st=new Student(12,30.5,"10/05/2010","Pune, Maharashtra, India",01,arr);
		st.read();
		st.calculateGrade();
		System.out.println("==================================================\n");

		String[] courses={"DSA","OOP","DBMS"};
		String[] advisee={"Please attend class","Focus on Study"};
		Professor p1=new Professor(44,70,"12/7/1962","Banglore,Karnataka,India",90000.90,"1980",22,courses);
		p1.read();
		p1.addAdvisee(1,"Take Care");
		p1.addAdvisee(2,"Attend Lecture");
		p1.addAdvisee(3,"Do your HomeWork");
		p1.addAdvisee(4,"Keep Healthi");
		p1.addAdvisee(5,"Take Notes");
		p1.listOfAdvisee();
		p1.removeListOfAdvisee(4);
		System.out.println("--------------------------");
		System.out.println("After removing 4th advisee");
		p1.listOfAdvisee();
		System.out.println("==================================================\n");
		
		Technician t1=new Technician(44,70,"12/7/1962","Banglore,Karnataka,India",90000.90,"1980",22);
		t1.read();
		System.out.println("==================================================");
	}
}

/*
C:\Users\dhuma\Desktop\C-DAC\Module 2\Assignment 3>java Main3

This is Student
Age of Person is: 12
Weight of Person is: 30.5
Date of Birth of Person is: 10/05/2010
Address of Person is: Pune, Maharashtra, India
Gred is First class with distiction
==================================================

This is Professor
Age of Person is: 44
Weight of Person is: 70.0
Date of Birth of Person is: 12/7/1962
Address of Person is: Banglore,Karnataka,India
-----------List of Advisee is----------
1 Take Care
2 Attend Lecture
3 Do your HomeWork
4 Keep Healthi
5 Take Notes
--------------------------
After removing 4th advisee
-----------List of Advisee is----------
1 Take Care
2 Attend Lecture
3 Do your HomeWork
5 Take Notes
==================================================

This is Technician
Age of Person is: 44
Weight of Person is: 70.0
Date of Birth of Person is: 12/7/1962
Address of Person is: Banglore,Karnataka,India
==================================================

C:\Users\dhuma\Desktop\C-DAC\Module 2\Assignment 3>

*/
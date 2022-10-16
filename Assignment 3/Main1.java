/*
1. Create an abstract class "Publication" with data members 'noOfPages', 'price', 'publisherName' etc. with 
their accessor/modifier functions. Now create two sub-classes "Book" and "Journal". Create a class 
Library that contains a list of Publications. Write a main() function and create three Books and two 
Journals, add them to library and print the details of all publications. 
*/

abstract class Publication{
	private int noOfPages;
	private double price;
	private String publisherName;
	abstract void type();
	Publication(){}
	Publication(int noOfPages, double price, String publisherName){this.noOfPages=noOfPages;this.price=price;this.publisherName=publisherName;}
	void print(){
		this.type();// this refere current object reference 
		System.out.println("Name of publication is: "+publisherName);
		System.out.println("Price is: "+price);
		System.out.println("noOfPages: "+noOfPages);
		System.out.println("======================================\n");
	}
}
class Book extends Publication{
	private static String type="Book";
	private String bookName;
	Book(){}
	Book(int noOfPages,double price, String publisherName, String bookName){
		super(noOfPages,price,publisherName);
		this.bookName=bookName;	
	}
	void type(){
		System.out.println("Type is: "+type);
	}
}

class Journal extends Publication{
	private static String type="Journal";
	private String journalName;
	Journal(int noOfPages,double price, String publisherName, String journalName){
		super(noOfPages,price,publisherName);
		this.journalName=journalName;	
	}
	void type(){
		System.out.println("Type is: "+type);
	}
}


class Library{
	int n=10;
	static int count=0;
	Publication[] list; //declaration of array
	Library(){
		list=new Publication[n];
	}
	Library(int n){
		this.n=n;
		list=new Publication[n];
	}
	
	void addBook(int noOfPages,double price, String publisherName, String bookName){
		list[count++]=new Book(noOfPages,price,publisherName,bookName);
	}
	void addJournal(int noOfPages,double price, String publisherName, String journalName){
		list[count++]=new Journal(noOfPages,price,publisherName,journalName);
	}
	void printDetails(){
		for( Publication a: list)
		{
			a.print();
		}
	}
}


public class Main1{
	public static void main(String[] args){
		
		Library l1=new Library(5);
		l1.addBook(450,1250,"Golbal","Power of Habit");
		l1.addBook(300,200,"Marvel","Iron Man");
		l1.addBook(200,150,"Nirali","Chala Hava Yeu dya");
		l1.addJournal(100,50,"Inday Today","India 2022");
		l1.addJournal(150,150,"TOI","Indian Economi");
		l1.printDetails();
	}
}
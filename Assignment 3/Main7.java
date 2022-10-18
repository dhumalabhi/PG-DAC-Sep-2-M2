/*
7. Create a class called Author is designed as follows: 
It contains: • three private instance variables: name (String), email (String), and gender (char of either m or f). • 
One constructor to initialize the name, email and gender with the given values. 
And, a class called Book is designed as follows: It contains: • Four private instance variables: name (String), author 
(of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written 
by one author. • One constructor which constructs an instance with the values given. • Getters and setters: 
getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again there is no setter for name 
and author. Write the class Book (which uses the Author class written earlier). Try: 
1.Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName()) 
2. After obtaining the Author object, print the Author (name, email & gender) of the book.

*/
class Author{
	private String name;
	private String email;
	private char gender;
	Author(){}
	Author(String name, String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	String getName(){
		return name;
	}
	char getGender(){
		return gender;
	}
	String getEmail(){
		return email;
	}
}
class Book1{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book1(){}
	Book1(String name, double price, int qtyInStock, String aname, String email, char gender){
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		author=new Author(aname,email,gender);
	}/*
	void authorDetail(){
		System.out.println("Author name is: "+author.getName());
		System.out.println("Author email is: "+author.getEmail());
		System.out.println("Author gender is: "+author.getGender());
	}*/
	String getBookName(){
		return name;
	}
	double getBookPrice(){
		return price;
	}
	int getQtyInStock(){
		return qtyInStock;
	}
	String getAuthor(){
		return author.getName();
	}
	void setPrice(double price){
		this.price=price;
	}
	void setQtyInStock(int n){
		qtyInStock=n;
	}
}
public class Main7{
	public static void main(String[] args){
		Book1 b1=new Book1("Power of Habit", 200.0, 3, "Staline", "staline12@gmail.com",'M');
		System.out.println("Name of Book is: "+b1.getBookName());
		System.out.println("Price of Book is: "+b1.getBookPrice());
		System.out.println("Total quantity of book: "+b1.getQtyInStock());
		System.out.println("Author Name is: "+b1.getAuthor());
		b1.setPrice(400.50);
		System.out.println("After setting price. Price is: "+b1.getBookPrice());
		b1.setQtyInStock(10);
		System.out.println("After setting Quantity. Quantity is: "+b1.getQtyInStock());
	}
}
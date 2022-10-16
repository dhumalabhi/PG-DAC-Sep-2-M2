# PG-DAC-Sep-2-M2
#Sep-2022 batch

Assignments of Object Oriented Systems Lab in Java

@author Abhijeet Ramesh Dhumal

-------------------------------------------------------------------Assigment 2--------------------------------------------------------

1. Implement a class for a “Book”. Book contains a title (a String), a list of authors (array of authors), number of 
pages (an integer), price (floating point number), publisher (a String) etc. Write suitable constructor and 
accessor/modifier methods. Implement a class for “Library”. A library contains a list of books (array of Book). 
Write add (to add a book) and remove (to delete a book) methods for library. Write a main() function to create a 
“Library” and add five “Book” to library. Print the total price of all books. 


2. Implement a class for “DateDemo”. Write member functions for (i) getting the previous day, (iv) getting the next 
day, (iii) printing a day There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; (ii) 
day is initialized to user specified value but month and year are initialized to 01, 1970; (iii) day, month are 
initialized to user specified value but year is initialized to 1970; (iv) day, month and year are initialized to user 
defined values. Also, write a main() function to (i) create a date object; (ii) print the next and the previous day. 


3. Write a class to represent complex numbers with necessary constructors. Write member functions to add, multiply 
two complex numbers. There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to 
initialize imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real part and the 
imaginary part to user defined values. Also, write a main() function to (i) create two complex numbers 3+2i and 4-
2i; (ii) to print the sum and product of those numbers. 


4. Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three fields. This class 
also has a method “volume()” to calculate the volume of this room. Create another class “RoomDemo” which will 
use the earlier class, create instances of rooms, and display the volume of room. 


5. Write a program to implement a class “student” with the following members. Name of the student. Marks of the 
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to 
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning 
of the above. 


6. Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write suitable 
constructors to initialize them. Add functions like “getVolume” and “getArea” that will return volume and surface 
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area. 

7.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as 
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and 
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the 
product. power() method that takes two integer numbers as parameter and returns the power of first number to 
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four 
methods of MathOperation class by providing entered numbers and prints the return values of every method.







-------------------------------------------------------------------Assigment 3--------------------------------------------------------


1. Create an abstract class “Publication” with data members ‘noOfPages’, ‘price’, ‘publisherName’ etc. with 
their accessor/modifier functions. Now create two sub-classes “Book” and “Journal”. Create a class 
Library that contains a list of Publications. Write a main() function and create three Books and two 
Journals, add them to library and print the details of all publications. 


2. Write a class for “Account” containing data members ‘accountNumber’, ‘holderName’, ‘balance’ and add 
constructors and necessary accessor/modifier functions for these data members. Now create two class 
“SavingsAccount” and “CurrentAccount” extending from this class. SavingsAccount will have a member 
variable ‘interestRate’ and member function ‘calculateYearlyInterest’. Write another class “Manager” that 
contains a list Account. Also write a main() function to create an instance of Manager class. Add two 
SavingsAccount and three CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print 
the details of all accounts. 


3. Implement a class for a “Person”. Person has data members ‘age’, ’weight’, ‘height’, ‘dateOfBirth’, 
‘address’ with proper reader/write methods etc. Now create two subclasses “Employee” and “Student”. 
Employee will have additional data member ‘salary’, ‘dateOfJoining’, ‘experience’ etc. Student has data 
members ‘roll’, ‘listOfSubjects’, their marks and methods ‘calculateGrade’. Again create two sub-classes 
“Technician” and “Professor” from Employee. Professor has data members ‘courses’, ‘listOfAdvisee’ and 
their add/remove methods. Write a main() function to demonstrate the creation of objects of different 
classes and their method calls. 


4. Create a base class “Automobile”. An Automobile contains data members ‘make’, ‘type’, ‘maxSpeed’, 
‘price’, ‘mileage’, ‘registrationNumber’ etc. with their reader/writer methods. Now create two sub-classes 
“Track” and “Car”. Track has data members ‘capacity’, ‘hoodType’, ‘noOfWheels’ etc. Car has data 
members ‘noOfDoors’, ‘seatingCapacity’ and their reader/writer methods. Create a main() function to 
demonstrate this.


5. Implement the classes for the following inheritance hierarchies. Create an interface “Shape” that contains 
methods ‘area’, ‘draw’, ‘rotate’, ‘move’ etc. Now create two classes “Circle” and “Rectangle” that 
implement this ‘Shape’ interface and implement the methods ‘area’, ‘move’, etc. Write a main() function 
to create two “Circle” and three “Rectangle”,then move them. Print the details of circles and rectangles 
before after moving them. 


6. A bookshop maintains the inventory of books that are being sold at the shop. The list includes details such 
as author, title, publisher, cost and stock position. Whenever a customer wants a book, the sales person 
inputs the title and author and the system searches the list and displays whether it is available or not. If it is 
not, an appropriate message is displayed. If it is, then the system displays the book details and details and 
requests for the number of copies required. If the required copies are available, the total cost of the 
requested copies is displayed, otherwise the message “requires copies not in stock” is displayed. Design a 
system using a class called “Book” with suitable member methods and constructors. 


7. Create a class called Author is designed as follows: 
It contains: • three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’). • 
One constructor to initialize the name, email and gender with the given values. 
And, a class called Book is designed as follows: It contains: • Four private instance variables: name (String), author 
(of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written 
by one author. • One constructor which constructs an instance with the values given. • Getters and setters: 
getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again there is no setter for name 
and author. Write the class Book (which uses the Author class written earlier). Try: 
  1.Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName()) 
  2. After obtaining the “Author” object, print the Author (name, email & gender) of the book. 



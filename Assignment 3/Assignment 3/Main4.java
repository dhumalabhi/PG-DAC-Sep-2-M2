/*
4. Create a base class Automobile. An Automobile contains data members make, type, maxSpeed, 
price, mileage, registrationNumber etc. with their reader/writer methods. Now create two sub-classes 
Track and Car. Track has data members capacity, hoodType, noOfWheels etc. Car has data 
members noOfDoors, seatingCapacity and their reader/writer methods. Create a main() function to 
demonstrate this. 
*/

class Automobile{
	private String make;
	private String type;
	private int maxSpeed;
	private double price;
	private int mileage;
	private int registrationNumber;
	Automobile(){}
	void read(){
		System.out.println("Maker of this vehicle: "+make);
		System.out.println("type of this vehicle: "+make);
		System.out.println("Max Speed of this vehicle: "+maxSpeed);
		System.out.println("price of this vehicle: "+price);
		System.out.println("mileage of this vehicle: "+mileage);
		System.out.println("Registration number of this vehicle: "+registrationNumber);
	}
	void write(String make, String type, int maxSpeed,double price, int mileage, int registrationNumber){
		this.make=make;
		this.type=type;
		this.maxSpeed=maxSpeed;
		this.price=price;
		this.mileage=mileage;
		this.registrationNumber=registrationNumber;
	}
}

class Track extends Automobile{
	int capacity;
	String hoodType;
	int noOfWheels;
	void write(int capacity, String hoodType, int noOfWheels,String make, String type, int maxSpeed,double price, int mileage, int registrationNumber){
		super.write(make,type,maxSpeed,price,mileage,registrationNumber);
		this.capacity=capacity;
		this.hoodType=hoodType;
		this.noOfWheels=noOfWheels;
	}
	void read(){
		super.read();
		System.out.println("Fuel capacity is: "+capacity);
		System.out.println("Hood type is: "+hoodType);
		System.out.println("No of wheels: "+noOfWheels);
		System.out.println("=======================================\n");
	}
}
class Car extends Automobile{
	int noOfDoors;
	int seatingCapacity;
	void write(int noOfDoors, int seatingCapacity, String make, String type, int maxSpeed,double price, int mileage, int registrationNumber){
		super.write(make,type,maxSpeed,price,mileage,registrationNumber);
		this.noOfDoors=noOfDoors;
		this.seatingCapacity=seatingCapacity;
	}
	void read(){
		super.read();
		System.out.println("No of door are : "+noOfDoors);
		System.out.println("Seat capacity is: "+seatingCapacity);
		System.out.println("=======================================\n");
	}	
}
public class Main4{
	public static void main(String []args){
		System.out.println();
		Track t1=new Track();
		t1.write(80, "Steel",6,"TATA","Utility",100,3000000,8,123456789);
		t1.read();
		Car c1=new Car();
		c1.write(2,2,"Bugatti","Sport Car",400,20000000,12,123456790);
		c1.read();
	}
}

/*
C:\Users\dhuma\Desktop\C-DAC\Module 2\Assignment 3>java Main4

Maker of this vehicle: TATA
type of this vehicle: TATA
Max Speed of this vehicle: 100
price of this vehicle: 3000000.0
mileage of this vehicle: 8
Registration number of this vehicle: 123456789
Fuel capacity is: 80
Hood type is: Steel
No of wheels: 6
=======================================

Maker of this vehicle: Bugatti
type of this vehicle: Bugatti
Max Speed of this vehicle: 400
price of this vehicle: 2.0E7
mileage of this vehicle: 12
Registration number of this vehicle: 123456790
No of door are : 2
Seat capacity is: 2
=======================================
*/
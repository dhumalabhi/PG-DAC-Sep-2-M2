/*
3. Write a class to represent complex numbers with necessary constructors. Write member functions to add, multiply 
two complex numbers. There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to 
initialize imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real part and the 
imaginary part to user defined values. Also, write a main() function to (i) create two complex numbers 3+2i and 4-
2i; (ii) to print the sum and product of those numbers. 
*/

class Complex{
	int r;
	int i;
	Complex(){}
	Complex(int r){ this.r=r; }
	Complex(int r, int i){ this.r=r; this.i=i; }
	Complex add(Complex c){
		return (new Complex((this.r+c.r),(this.i+c.i)));
	}
	Complex multiply(Complex c){
		return (new Complex( (r*c.r-i*c.i),(r*c.i+i*c.r) ));
	}
	void print(){
		System.out.println(this.r+" + "+this.i+"i");
	}	
}

public class Test3{
	public static void main(String[] args){
		Complex c1=new Complex(3,2);
		Complex c2=new Complex(4,-2);
		Complex c3=c1.add(c2);
		System.out.println("Adition is: ");
		c3.print();
		c3=c1.multiply(c2);
		System.out.println("Multiplication is: ");
		c3.print();
	}
}

/*
OUTPUT:

C:\Users\dhuma\Desktop\C-DAC\Module 2\Assigment 2>java Test3
Adition is:
7 + 0i
Multiplication is:
16 + 2i

*/
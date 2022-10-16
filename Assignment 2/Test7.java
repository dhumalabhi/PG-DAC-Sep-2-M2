/*
7.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as 
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and 
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the 
product. power() method that takes two integer numbers as parameter and returns the power of first number to 
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four 
methods of MathOperation class by providing entered numbers and prints the return values of every method.
*/

class MathOperation{
	static int add(int a, int b){
		return a+b;
	}
	static int subtract(int a, int b){
		return a-b;
	}
	static int multiply(int a, int b){
		return a*b;
	}
	static int power(int a, int b){
		return (int)Math.pow(a,b);
	}

}
public class Test7{
	public static void main(String[] args){
		System.out.println("Sum of number 34 and 54 is: "+MathOperation.add(34,54));
		System.out.println("Subtraction of number 34 and 54 is: "+MathOperation.subtract(34,54));
		System.out.println("Multplication of number 34 and 54 is: "+MathOperation.multiply(34,54));
		System.out.println("Power of number 34 to 5 is: "+MathOperation.power(34,5));
	}
}
/*
OUTPUT:
Sum of number 34 and 54 is: 88
Subtraction of number 34 and 54 is: -20
Multplication of number 34 and 54 is: 1836
Power of number 34 to 5 is: 45435424



*/
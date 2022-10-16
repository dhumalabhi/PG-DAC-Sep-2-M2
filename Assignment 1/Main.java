class Main{
	public static void main(String[] args)
	{
		
	}
}

abstract class Animal{
	String name;
	Animal(){
		System.out.println("Animal is created");
	}
	void walk(){
		System.out.println("Animal is walking");
	}
	
	abstract void eat();
}

class Dog extends Animal{
	
	Dog(){
		System.out.println("Dog is created");
	}
}
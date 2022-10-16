/*
6. Write a class Box that with three member-variables height, width and breadth. Write suitable 
constructors to initialize them. Add functions like getVolume and getArea that will return volume and surface 
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.
*/

class Box{
	double height;
	double width;
	double breadth;
	Box(){}
	Box(double height, double width, double breadth){this.height=height;this.width=width;this.breadth=breadth;}
	double getVolume(){
		return (height*width*breadth);
	}
	double getArea(){
		return (2*height*width+2*height*breadth+2*width*breadth);
	}
}

class Test6{
	public static void main(String[] args)
	{
		Box b1=new Box(10,12,14);
		System.out.println("Voleme of first box: "+b1.getVolume());
		System.out.println("Area of first box: "+b1.getArea());
		System.out.println("===========================================");
		Box b2=new Box(10,10,10);
		System.out.println("Voleme of first box: "+b2.getVolume());
		System.out.println("Area of first box: "+b2.getArea());	
	}
}

/*
OUTPUT:


Voleme of first box: 1680.0
Area of first box: 856.0
===========================================
Voleme of first box: 1000.0
Area of first box: 600.0


*/
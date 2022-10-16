/*
4. Create a class "Room" which will hold the "height", "width" and "breadth" of the room in three fields. This class 
also has a method "volume()" to calculate the volume of this room. Create another class "RoomDemo" which will 
use the earlier class, create instances of rooms, and display the volume of room.
*/

class Room{
	double height;
	double breadth;
	double width;
	Room(){}
	Room(double height, double breadth, double width){this.height=height;this.breadth=breadth;this.width=width;}
	void volume(){
		System.out.println("Volume of Room is: "+height*breadth*width+"m3");
	}
}
class RoomDemo{
	
	static void callValume(){
		Room r=new Room(10,10,10);
		r.volume();
	}
}

public class Test4{
	public static void main(String[] args){
		//RoomDemo r1= new RoomDemo();
		RoomDemo.callValume();
		
	}
}
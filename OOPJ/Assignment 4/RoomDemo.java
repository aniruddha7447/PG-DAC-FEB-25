
/*
Q1. Room Volume Calculation

Design a class named Room with three data members: height, width, and breadth. Include
a method volume() to compute and return the volume of the room. Create a separate class
RoomDemo that creates instances of the Room class and displays the volume for each
instance. 
*/







class Room{
	float height, width, breadth;
	
	Room(float height, float width, float breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	float volume(){
		float val = (float) height*width*breadth;
	display(val);
	return val;
}

void display(float val){
	System.out.println("Volume of Room : " + val + " cubic units");
}
}



class RoomDemo{
	public static void main (String args[]){
		
		Room r1 = new Room(15f,25f,20f);
		r1.volume();
		
		
		
	}
}




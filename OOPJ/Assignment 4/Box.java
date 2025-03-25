
/*
Q3. Box Area and Volume

Write a class Box with three member variables: height, width, and breadth. Include
appropriate constructors to initialize these variables. Also, implement two methods:
		● getVolume() to return the volume of the box
		● getArea() to return the surface area of the box
Create two instances of the Box class and display their volumes and surface areas. 

*/

class Box{
	float height, width, breadth;


	Box(float height, float width, float breadth){
		this.width = width;
		this.breadth = breadth;
		this.height = height;
	}
	
	
	float getVolume(){
		float vol = (float) (height * width * breadth);
		return vol;
	}
	
	float getArea(){
		float area = (float) 2*(height * width + width * breadth + breadth * height);
		return area;
	}
	
	void display(){
		System.out.printf("Volume of Box : %.2f%n", getVolume());
		System.out.printf("Area of Box : %.2f%n", getArea());
	}
	
	
	public static void main(String arge[]){
		Box b1 = new Box(12,21,33);
		b1.display();
		
	}
	
}
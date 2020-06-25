package sef.module6.activity;

public class Rectangle extends Shape {

		//Attributes
		public double length;
		public double breadth;
		
		//Behavior - default constructor
		public Rectangle(){ 
			System.out.println("I'm default constructor"); 
		}
		
		//Behavior - parameterized constructor
		public Rectangle(int length, int breadth){
			this.length = length;
			this.breadth = breadth;
		}

		public double calculateArea() {	
			return length * breadth;
		}

		public double calculatePerimeter() {
			return 2 *(length + breadth);
		}
		
		
	
}

package ex2;

public class ex7 {
	/*main method
	 */
	public static void main(String[] args) {
		//Create a circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius "+ circle1.radius +" is " +circle1.getArea());
		
		
		//Create a circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius "+circle3.radius +" is "+circle3.getArea());
		
		
		//Modify circle radius
		SimpleCircle circle2 = new SimpleCircle(100);
		System.out.println("The area of the circle of radius "+circle2.radius + " is "+circle2.getArea());
		
	}

}

//Define the circle class with two constructors
class SimpleCircle{
	double radius;
	
	//Construct a circle with radius 1
	SimpleCircle(){
		radius = 1;
	}
	//Construct a circle with a specified radius
	SimpleCircle(double newRadius){
		radius = newRadius;
	}
	
	//Returm the area of this circle
	double getArea() {
		return radius*radius*Math.PI;
		
	}
	//return the perimeter of this circle
	double getPerimeter() {
		return 2*radius*Math.PI;
		
	}
	
	//set a new radius for this circle
	
	
}

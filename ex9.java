package ex2;

public class ex8 {
	/*main method
	 */
	public static void main(String[] args) {
		//Create a circle with radius 1


		SimpleCircle circle2 = new SimpleCircle();
		circle2.setRadius(100);
		
		System.out.println("The area of the circle of radius "+circle2.radius + " is "+circle2.getArea());
		
	}

}

//Define the circle class with two constructors
class SimpleCircle{
	double radius;
	
	//set a new radius for this circle
	void setRadius(double newRadius) {
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
	

}

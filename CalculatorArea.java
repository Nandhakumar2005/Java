package semester_3;

class AreaCalculator {
	public void Area (double radius) {
		double Area = 3.14*radius*radius;
		System.out.println("The area of the circle : " + Area);
	}
	public void Area (double l,double b) {
		double Area = l*b;
		System.out.println("The area of the rectangle : " + Area);
	}
	public void Area (float b,double h) {
		double Area = 0.5*b*h;
		System.out.println("The area of the triangle : " + Area);
	}
	public void Area (int side) {
		int Area = side*side;
		System.out.println("The area of square : " + Area);
	}
}

public class CalculatorArea {
	public static void main (String [] args) {
		AreaCalculator area = new AreaCalculator();
		area.Area(7.7777);
		area.Area(5.234,234.23);
		area.Area(5.32,1234.23);
		area.Area(25);
	}
}

package task2;
public class Rectangle extends Shape {
	 private double width;
	 private double length;
	 public Rectangle() { // 1st (default) constructor
		 width = 1.0;
		 length = 1.0;
	}
	 
	 /** Constructs a Circle instance with the given radius and default color */
	 public Rectangle(double w, double l) { // 2nd constructor
	 width = w;
	 length = l;
	 }

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	 /** Returns the area of this Rectangle instance */
	 public double getArea() {
	 return length*width;
	 }
	 
	 /** Returns the area of this Rectangle Perimeter */
	 public double getPerimeter() {
	 return 2*(length+width);
	 }
	 @Override
	 public String toString() {
	 return "A Rectangle with width = "+width+ "and length" + length + ",  which is a subclass of "+super.toString();
	 }

}
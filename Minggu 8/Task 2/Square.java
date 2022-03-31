package task2;
public class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}

	public double area() {
		System.out.println("Square Area");
		return this.getLength() * this.getWidth();
	}


	public double perimeter() {
		System.out.println("Square Perimeter");
		return 2 * (this.getLength() + this.getWidth());
	}

	public void setLength(int side) {
		super.setLength(side);
	}


	public void setWidth(int side) {
		super.setWidth(side);
	}

	@Override
	public String toString() {
		return "A Square with side="+this.getLength()+", which is a subclass of "+super.toString();
	}
}



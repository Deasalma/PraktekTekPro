package task2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() { // 1st (default) constructor
		color = "green";
		filled = true;
	}
	public Shape(String clr, boolean filled) {
		this.color = clr;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if (filled) {
			 return "A Shape with color of " + color + " and Filled";
		}else {
			 return "A Shape with color of " + color + " and Not Filled";
		}
		
		
	}
}



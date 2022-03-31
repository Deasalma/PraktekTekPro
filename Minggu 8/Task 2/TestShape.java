package task2;


public class TestShape {
	 public static void main (String[] args) {
		 // Declare and allocate a new instance of cylinder
		 // with default color, radius, and height
		 Shape s1 = new Shape();
		 System.out.println("Shape:"
		 + " color = " + s1.getColor()
		 + " Filled = " + s1.isFilled());

		 // Declare and allocate a new instance of cylinder
		 // specifying height, with default color and radius
		 Shape s2 = new Shape("red", false);
		 System.out.println("Shape:"
				 + " color = " + s1.getColor()
				 + " Filled = " + s1.isFilled());
		 
		System.out.println("\n");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		
	 }
}

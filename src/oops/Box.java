package oops;

public class Box {

	protected double length;
   protected 	double breadth;
   Box(double length, double breadth) {
       this.length = length;
       this.breadth = breadth;
   }
   
   double area() {
       return length * breadth;
   }
   
   
}

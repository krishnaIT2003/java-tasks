package oops;

public class Box3d extends Box{
	 private double height;
	 Box3d(double length, double breadth, double height) {
	        super(length, breadth); 
	        this.height = height;
	    }
	 
	  double volume() {
	        return length * breadth * height;
	    }
	  
	  @Override
	    double area() {
	        return 2 * (length * breadth + breadth * height + height * length);
	    }
}

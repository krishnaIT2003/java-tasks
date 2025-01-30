package oops;

public class Square extends Shape{
	private double side;

   
    Square(double side) {
        this.side = side;
    }

    
    @Override
	public double area() {
        return side * side;
    }


    @Override
	public double perimeter() {
        return 4 * side;
    }
}

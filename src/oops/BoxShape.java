package oops;

public class BoxShape {
public static void main(String[] args) {
	Box box=new Box3d(10.5, 2.2, 8.6);
	System.out.println(box.area());
	Box box2=new Box(4.4, 3.6);
	System.out.println(box2.area());
}
}

package exceptions;

public class MultipleCatch {
public static void main(String[] args) {
	int arr[]= {1,2,3};
		try {
			System.out.println(arr[6]);
			System.out.println(3/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
}
}

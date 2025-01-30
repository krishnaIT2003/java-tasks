package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionFlowExample {
	public static String testMethods() {
		int arr[]= {1,2,3};
		try {
			File f=new File("hey.txt");
			
			System.out.println(arr[5]);
			System.out.println(arr[1]/0);
			 f.createNewFile(); 
		}
		 catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: " + e.getMessage());
	            return "Arithmetic Exception occurred";
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
	            return "Array Index Out of Bounds Exception occurred";
	        } catch (IOException e) {
	            System.out.println("IOException: " + e.getMessage());
	            return "IO Exception occurred";
	        } catch (Exception e) {
	            // This will catch any other exceptions
	            System.out.println("Exception: " + e.getMessage());
	            return "General Exception occurred";
	        }
		return "no exception";
	}
	
public static void main(String[] args) {
	System.out.println(testMethods());
}
}

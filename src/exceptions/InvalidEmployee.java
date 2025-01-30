package exceptions;

public class InvalidEmployee extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployee() {
super("given Employee ID is not found or mismatched");
	}
	
}

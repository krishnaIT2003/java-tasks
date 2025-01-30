package exceptions;

public class InvalidAgeException extends Exception{
public InvalidAgeException() {
super("your age is less than 18");
}
}

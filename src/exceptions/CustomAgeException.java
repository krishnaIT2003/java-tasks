package exceptions;

import java.util.Scanner;

public class CustomAgeException {
public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter age");
	int age=sc.nextInt();
	
	try {
		if(age<18) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("you are eligible");
		}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}

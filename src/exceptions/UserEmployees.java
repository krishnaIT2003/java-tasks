package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserEmployees {
public static void main(String[] args) throws InvalidEmployee{
	List<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(100,"krishna","hyderabad"));
	employees.add(new Employee(101,"sakshi","nagpur"));
	employees.add(new Employee(102, "prithvi", "hyderabad"));
	employees.add(new Employee(103, "tharun", "hyderabad"));
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employee id ");
	int id=sc.nextInt();

	try {
		if(employees.stream().anyMatch((a)->id==a.getId())) {
			System.out.println("Welcome to office");
		}
		else {
			throw new InvalidEmployee();
		}
	}
	catch(InvalidEmployee e) {
		System.out.println(e.getMessage());
	}
}
}

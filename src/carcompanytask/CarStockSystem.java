package carcompanytask;

import java.util.Scanner;

public class CarStockSystem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	CarBookMangement carBookMangement=new CarBookMangement();
	carBookMangement.initializeStock();
	
	 System.out.println("Welcome to the Car Company Stock Management System!");
    while(true) {
    	 System.out.print("Enter your name to register: ");
         String userName = sc.next();
         System.out.println("Hi, " + userName + "! Here are the mercedes available car models:");
         carBookMangement.displayCarTypes("Mercedes");
         sc.nextLine();
       System.out.println("enter carType ");
     String carType=sc.next();
     carBookMangement.bookModel(carType,sc);
    }
	
    

}


}

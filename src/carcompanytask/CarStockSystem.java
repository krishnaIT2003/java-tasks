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
         if (userName.matches(".*\\d.*")) {
             System.out.println("Invalid username: Username should not contain numbers.");
             break;
         } else {
             System.out.println("Valid username: " + userName);
         }
         
         System.out.println("Hi, " + userName + "! Here are the mercedes available car models:");
         carBookMangement.displayCarTypes("Mercedes");
         sc.nextLine();
               System.out.println("enter carType ");
     String carType=sc.next();
     if (carType.matches(".*\\d.*")) {
         System.out.println("Invalid cartype.");
         break;
     } else {
         System.out.println("Valid username: " + userName);
     }

     carBookMangement.bookModel(carType,sc);
     carBookMangement.storePurchaseDetails(userName, carType);
    }
	
    

}


}

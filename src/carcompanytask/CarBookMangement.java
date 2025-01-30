package carcompanytask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarBookMangement {
	Map<String,Map<String,List<Car>>>carStocks=new HashMap<>();
	 	
	String modelName;
	
	
	
	
	public void bookModel(String carType,Scanner sc) {
		
		List<Car> list = carStocks.get("Mercedes").get(carType).stream().filter(n->n.getQuantity()>0).collect(Collectors.toList());
		if(!list.isEmpty()) {
			System.out.println(list);
			
		}
		else {
			System.out.println("sorry no stocks available");
			return;
		}
		System.out.println("enter model");
		 modelName=sc.next();
		boolean anyMatch = list.stream().anyMatch(n->n.getName().equalsIgnoreCase(modelName));
		if(anyMatch) {
			System.out.println("sucessfull purchased the model "+modelName);
			carStocks.get("Mercedes").get(carType).stream().filter(car->car.getName().equalsIgnoreCase(modelName))
			.findFirst().ifPresent(car->car.setQuantity(car.getQuantity()-1));
			
		}
		else {
			System.out.println("enter valid model name");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public   void initializeStock() {
		
        Map<String, List<Car>> mercedesCars = new HashMap<>();
        mercedesCars.put("SUV", Arrays.asList(
                new Car("GLC330D", 5),
                new Car("GLE220D", 0),
                new Car("GLD450", 2)
        ));
        mercedesCars.put("Hatchback", Arrays.asList(
                new Car("Glc200", 4),
                new Car("Eclass", 3),
                new Car("Cclass", 2)
        ));
        mercedesCars.put("Coupe", Arrays.asList(
                new Car("530d", 1)
        ));
        
        carStocks.put("Mercedes", mercedesCars);
    }
	public  void displayCarCompanies() {
	    for (String company : carStocks.keySet()) {
	        System.out.println("- " + company);
	    }
	}
	public  void displayCarTypes(String company) {
		int count=1;
	    for (String type : carStocks.get(company).keySet()) {
	    	
	        System.out.println((count++)+"- " + type);
	    }
	}
	 public void storePurchaseDetails(String userName, String carType) {
	        File file = new File("purchase_log.txt");
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
	            writer.write("Customer Name: " + userName + ", Car Type: " + carType + ", Model: " + modelName + "\n");
	            System.out.println("Purchase recorded: " + userName + " bought a " + modelName + " " + carType);
	        } catch (IOException e) {
	            System.out.println("Error saving purchase details: " + e.getMessage());
	        }
	    }
    
}

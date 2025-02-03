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
	
	
	
	
	public void bookModel(String carType, Scanner sc) {
	    // Normalize the carType input to lowercase for case-insensitive comparison
	    String normalizedCarType = carType.trim().toLowerCase();
	    
	    // Check if the car type exists for Mercedes (case-insensitive matching)
	    if (carStocks.containsKey("Mercedes")) {
	        Map<String, List<Car>> mercedesCars = carStocks.get("Mercedes");
	        
	        // Convert car types in the map to lowercase for case-insensitive comparison
	        boolean carTypeExists = mercedesCars.keySet().stream()
	            .anyMatch(type -> type.toLowerCase().equals(normalizedCarType));
	        
	        if (carTypeExists) {
	            List<Car> list = mercedesCars.get(normalizedCarType).stream()
	                    .filter(n -> n.getQuantity() > 0)
	                    .collect(Collectors.toList());

	            if (!list.isEmpty()) {
	                System.out.println(list);
	            } else {
	                System.out.println("Sorry, no stocks available for this model.");
	                return;
	            }

	            System.out.println("Enter model: ");
	            modelName = sc.next();

	            // Check if the model exists in the filtered list (case-insensitive)
	            boolean anyMatch = list.stream().anyMatch(n -> n.getName().equalsIgnoreCase(modelName));
	            if (anyMatch) {
	                System.out.println("Successfully purchased the model " + modelName);
	                mercedesCars.get(normalizedCarType).stream().filter(car -> car.getName().equalsIgnoreCase(modelName))
	                        .findFirst().ifPresent(car -> car.setQuantity(car.getQuantity() - 1));
	            } else {
	                System.out.println("Invalid model name entered.");
	            }
	        } else {
	            System.out.println("Invalid car type: " + carType);
	        }
	    }
	}

	public void displayCarTypes(String company) {
	    int count = 1;
	    // Normalize the display output by showing lowercase car types
	    Map<String, List<Car>> mercedesCars = carStocks.get(company);
	    for (String type : mercedesCars.keySet()) {
	        // Display the type with the same casing as in the stock, so it's more user-friendly
	        System.out.println(count++ + "- " + type);
	    }
	}

	
	
	public void initializeStock() {
	    // Create a map to store the car types in lowercase
	    Map<String, List<Car>> mercedesCars = new HashMap<>();
	    
	    // Convert car types to lowercase before adding them to the map
	    mercedesCars.put("suv", Arrays.asList(
	            new Car("GLC330D", 5),
	            new Car("GLE220D", 0),
	            new Car("GLD450", 2)
	    ));
	    mercedesCars.put("hatchback", Arrays.asList(
	            new Car("Glc200", 4),
	            new Car("Eclass", 3),
	            new Car("Cclass", 2)
	    ));
	    mercedesCars.put("coupe", Arrays.asList(
	            new Car("530d", 1)
	    ));
	    
	    // Store the map in the carStocks map
	    carStocks.put("Mercedes", mercedesCars);
	}

	public  void displayCarCompanies() {
	    for (String company : carStocks.keySet()) {
	        System.out.println("- " + company);
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

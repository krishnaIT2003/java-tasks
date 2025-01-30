package oops;

public class PolymorphismExample {
public static void main(String[] args) {
	  ShoppingCentre homeShop = new HomeShoppingCentre();
	  ShoppingCentre townShop = new TownShoppingCentre();
	  System.out.println("Specialty of Home Shop: " + homeShop.getSpecialty());
	  System.out.println("Specialty of Town Shop: " + townShop.getSpecialty());
}
}

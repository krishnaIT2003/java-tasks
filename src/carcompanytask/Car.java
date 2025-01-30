package carcompanytask;

public class Car {
private String name;
private int quantity;
public Car(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
}
public String getName() {
    return name;
}

public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}
@Override
public String toString() {
	return "Car [name=" + name + ", quantity=" + quantity + "]";
}

}

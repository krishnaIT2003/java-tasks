package exceptions;

public class Employee {
private String name;
private int id;
private String address;

public Employee( int id,String name, String address) {
	super();
	this.name = name;
	this.id = id;
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}

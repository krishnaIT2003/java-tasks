package oops;

import java.util.ArrayList;
import java.util.List;



public class CellPhone {
public static void main(String[] args) {
	Contacts user=new Contacts("krishna");
	user.addPhoneNumber("345465463642");
	user.addPhoneNumber("354662626","354254264626");
	user.displayNumbers();
}
}

package oops;

import java.util.ArrayList;
import java.util.List;

class Contacts{
	private String name;
	private List<String>phoneNumbers;
	
	Contacts(String name){
		this.name=name;
		this.phoneNumbers=new ArrayList<String>();
	}
	public void addPhoneNumber(String phoneNumber) {
		this.phoneNumbers.add(phoneNumber);
	}
	public void addPhoneNumber(String ...phoneNumber) {
                    for(String no:phoneNumber) { 
                    	this.phoneNumbers.add(no);
                    	
                    }
	}
	public void displayNumbers() {
		
		
		System.out.println(phoneNumbers);
	}
}
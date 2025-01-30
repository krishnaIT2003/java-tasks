package collections;

import java.util.Arrays;

public class StringArrayModify {

	public static String[] ModifyArray(String arr[]) {
		Arrays.sort(arr);
		int n=arr.length;
		int middleindex=(n/2)+(n%2);
	
		for(int i=0;i<arr.length;i++) {
			if(i<middleindex) {
				arr[i]=arr[i].toLowerCase();
			}
			else {
				arr[i]=arr[i].toUpperCase();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
	
	String arr[]= {"apple","Banana","Orange","Mango","Grapes"};
	String []modifiedArray=ModifyArray(arr);
	System.out.println(Arrays.toString(modifiedArray));
	
	
	
	
}
}

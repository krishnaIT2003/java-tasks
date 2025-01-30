package collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializeArrayList {
public static void main(String[] args) throws FileNotFoundException, IOException {
	ArrayList<Integer>arrayList=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("arrayList.ser"))){
		out.writeObject(arrayList);
		System.out.println("arrayList serialized sucessfully ");
	}
	catch(Exception e ) {
	e.printStackTrace();
	}
	
			
}
}

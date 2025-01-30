package collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializeHashMap {
public static void main(String[] args) throws FileNotFoundException, IOException {
	HashMap<Integer,String>map=new HashMap<Integer, String>();
	map.put(1, "krishna");
	map.put(2, "prithvi");
	map.put(3, "bharath");
	map.put(4, "tharun");
	try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("hashMap.ser"))){
		oos.writeObject(map);
		System.out.println("hasmap serialized sucessfully ");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}

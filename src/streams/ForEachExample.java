package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachExample {
public static void main(String[] args) {
List<String >list= new ArrayList<String>(Arrays.asList("orange","apple","banana","grapes"));

list.stream().forEach((fruits)->System.out.println("forEach: "+fruits));

list.stream().parallel().forEachOrdered((fruits)->System.out.println("foreach ordered: "+fruits));
}
}

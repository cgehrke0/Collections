package hashset;

import java.util.*;

public class Convert {
	public static void main(String[] args) {
		
		HashSet<String> h_set = new HashSet<String>();
		
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Orignial Hash Set: " + h_set);
		
		String[] new_array = new String[h_set.size()];
		h_set.toArray(new_array);
		
		System.out.println("Array elements: ");
		for(String element : new_array) {
			System.out.println(element);
		}
	
	Set<String> tree_set = new TreeSet<String>(h_set);
	
	System.out.println("TreeSet elements: ");
	for(String element : tree_set) {
		System.out.println(element);
	}
	
	List<String> list = new ArrayList<String>(h_set);
	
	
	System.out.println("ArrayList contains: "+ list);

}
}
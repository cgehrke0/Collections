package arraylist;

import java.util.*;

public class Iterate {
	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		//Person p = new Person("Jack", 22, 'M');
		//list_Strings.add(p);
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		System.out.println("Array list before Swap:");
		for(String a: list_Strings) {
			System.out.println(a);
		}
		
		Collections.swap(list_Strings,  0,  2);
		System.out.println("Array list after swap:");
		for(String b: list_Strings) {
			System.out.println(b);
		}
		//Shuffle
		//System.out.println("List before shuffling:\n" + list_Strings);
		//Collections.shuffle(list_Strings);
		//System.out.println("List after shuffling: \n" + list_Strings);
		
		//Iterate
		//for (String element : list_Strings) {
			//System.out.println(element);
		//}
	}

}

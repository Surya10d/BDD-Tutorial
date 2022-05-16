package test_basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> numbers = new HashMap<String,String>();
		numbers.put("1","one");
		numbers.put("2", "two");
		numbers.put("3", "three");
		numbers.put("4", "four");
//		System.out.println("Map values are: "+numbers);
		System.out.println("Keys present in map: ");
		for(String i : numbers.keySet()) {
			System.out.println(i);
		}
		System.out.println("Values present in map: ");
		for(String i : numbers.values()) {
			System.out.println(i);
		}	
		// Access an item in map by using .get(<value>) method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to get the value");
		String sr = sc.next();
		System.out.print("Entered key is : "+sr);
		System.out.print(" and value is : "+numbers.get(sr));
		System.out.println("Entered key is being removed");
		numbers.remove(sr);
		System.out.println(numbers);
		System.out.println("The Hashmap size is "+numbers.size());		
	}

}

package test_basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectList {

	public static void main(String[] args) {
		List<Object> l1 = new ArrayList<Object>();
		l1.add("abcd");
		l1.add(12);
		l1.add(123.123);
		l1.add(true);
		System.out.println("List values are : ");
		System.out.println(l1);
	
		Map<Object,Object> m1 = new HashMap<Object,Object>();
		m1.put(1,"one");
		System.out.println("Map before updating : " +m1);
		m1.get(1);
		m1.put(1,"two");
		System.out.println("Map after updating : "+m1);
		
	}

}

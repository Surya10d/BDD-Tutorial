package test_basic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Arrlist {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
//		l1.add("one");
//		l1.add("two");
//		l1.add("three");
//		l1.add("four");
//		System.out.println(l1);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the index to get the value on list:");
//		Integer i1 = sc.nextInt();
//		System.out.println("Value at index "+i1+ " is "+ l1.get(i1));
//		System.out.println("Enter the value to change to value :");
//		String s2 = sc.next();
//		System.out.println("List is updated :");
//		l1.set(i1,s2);
//		System.out.println(l1);
//		System.out.println("Enter the value to remove");
//		String i2 = sc.next(); 
//		l1.remove(i2);
//		l1.remove(i2);
//		System.out.println("Removed index and list updated" + l1);
//		System.out.println("List size before clearing is :"+l1.size());
//		System.out.println("Removing all items in list");
//		l1.clear();
//		System.out.println(l1);
		l1 = new ArrayList<String>(Arrays.asList("one","two","Three"));
		for(int i=0;i<l1.size();i++) {
			System.out.println("List index :"+i+" List value: "+l1.get(i));
		}
		System.out.println("In For each loop");
		for(String i: l1) {
			System.out.println(i);
		}
		System.out.println(" Linked List : ");
		LinkedList<String> l2 = new LinkedList<String>(Arrays.asList("1","2","3","4"));
		System.out.println("Linked List "+l2);
		
	}

}

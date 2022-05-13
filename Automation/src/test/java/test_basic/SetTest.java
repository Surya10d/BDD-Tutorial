package test_basic;
import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> home = new HashSet<String>();
		home.add("Main hall");
		home.add("Kitchen");
		home.add("Bedroom one");
		home.add("Bedroom two");
		// Duplicated parameters 
		home.add("Bedroom one");
		home.add("Bedroom one");
		System.out.println(home);
		System.out.println(home.contains("Bedroom"));
		System.out.println(home.contains("Bedroom one"));
		System.out.println("Remove one element");
		home.remove("Bedroom one");
		System.out.println(home.size());
		for(String i:home) {
			System.out.println(i);
		}
		home.clear();
	}

}

package test_basic;
import test_basic.ClassTest;

public class ChildclassTest extends ClassTest{

	public ChildclassTest(int n) {
		super(n);
	}

	public static void main(String[] args) {
		ClassTest ch = new ClassTest(100);
		System.out.println("The main class var value is : "+ch.prno);
	}

}

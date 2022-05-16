package test_basic;

abstract class Demo //abstract class  
	{  
	//abstract method declaration  
	abstract void display();  
	}  
public class AbstractTest extends Demo  
	{  
	//method impelmentation  
	void display()  
	{  
		System.out.println("This is a Abstract method");  
	}  
	public static void main(String args[])  
	{  
	//creating object of abstract class  
		Demo obj = new AbstractTest();  
	//invoking abstract method  
	obj.display();  
		}  
}  

package test_basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import test_basic.ReflectChildclass;
import test_basic.ReflectClass;

public class ReflectInheritClass extends ReflectChildclass implements ReflectClass{
	public int publicInt;
	private String privateString="private string";
	protected boolean protectedBoolean;
	Object defaultObject;
	
	public ReflectInheritClass(int i){
		this.publicInt=i;
	}

	@Override
	public void method1() {
		System.out.println("Method1 impl.");
	}

	@Override
	public int method2(String str) {
		System.out.println("Method2 impl.");
		return 0;
	}
	
	@Override
	public int method4(){
		System.out.println("Method4 overriden.");
		return 0;
	}
	
	public int method5(int i){
		System.out.println("Method4 overriden.");
		return 0;
	}
	
	// inner classes
	public class ConcreteClassPublicClass{}
	private class ConcreteClassPrivateClass{}
	protected class ConcreteClassProtectedClass{}
	class ConcreteClassDefaultClass{}
	
	//member enum
	enum ConcreteClassDefaultEnum{}
	public enum ConcreteClassPublicEnum{}
	
	//member interface
	public interface ConcreteClassPublicInterface{}
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> reflectInheritClass = ReflectInheritClass.class;
		reflectInheritClass = new ReflectInheritClass(5).getClass();
		try {
			// below method is used most of the times in frameworks like JUnit
			//Spring dependency injection, Tomcat web container
			//Eclipse auto completion of method names, hibernate, Struts2 etc.
			//because ConcreteClass is not available at compile time
			reflectInheritClass = Class.forName("test_basic.ReflectInheritClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//		Get canonical name is used to get the class name
		System.out.println(reflectInheritClass.getCanonicalName()); // prints com.journaldev.reflection.ReflectInheritclass

		//for primitive types, wrapper classes and arrays
		Class<?> booleanClass = boolean.class;
		System.out.println(booleanClass.getCanonicalName()); // prints boolean

		Class<?> cDouble = Double.TYPE;
		System.out.println(cDouble.getCanonicalName()); // prints double

		Class<?> cDoubleArray;
		try {
			cDoubleArray = Class.forName("[D");
			System.out.println(cDoubleArray.getCanonicalName()); //prints double[]
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class<?> twoDStringArray = String[][].class;
		System.out.println(twoDStringArray.getCanonicalName());
		System.out.println("Geting super class objects");
		Class<?> superclass =  reflectInheritClass.getSuperclass();
		System.out.println(superclass);
		System.out.println(Object.class.getSuperclass());
		System.out.println(String[][].class.getSuperclass());
		System.out.println("Getting public members classes");
		Class[] classes = reflectInheritClass.getClasses();
		
		
	}

}

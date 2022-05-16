package test_basic;

import java.util.Scanner;

public class StaticTest{  
		//	Static variable count will get memory only once and retain its value
		static int count=0;
		// 	Instance variable cc will be initialized when new object is created for static Test class
		public int cc = 0;
		// StaticTest is a constructor used to increment and print the static variable value 
		StaticTest(){  
			count++; //incrementing the value of static variable  
			System.out.println(count);  
		}  
		
		void dispValue() {
			this.cc = 10; // class variable
		} 
		
		void modifyValue(int i) {
			count = i; // Static variable
		}

		public static void main(String args[]){  
		//creating objects
			System.out.println("Value is getting incremented when every call");
			StaticTest c1=new StaticTest();  
			StaticTest c2=new StaticTest();  
			StaticTest c3=new StaticTest();
			System.out.println("Static Method is invoked to modify the static field");
			System.out.println("Enter the value to modify the static field");
			Scanner sc = new Scanner(System.in);
			int newip = sc.nextInt();
			c3.modifyValue(newip-1);
			StaticTest c4 = new StaticTest();
			c4.dispValue();
			System.out.println(c4.cc);
		}  

}

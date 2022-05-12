package test_basic;

import java.util.Scanner;

public class FibonacciSeries{

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		Integer i1 = sc.nextInt();
		System.out.println("The fibonacci series are ");
		for(int i =1;i<i1;i++){
			System.out.print(a);
			a = b;
			b = c;
			c = a + b;
		}
	}
}

package test_basic;

import java.util.Scanner;

import test_basic.PrvClassCall;
import test_basic.Prvclass;

public class Nestedclass extends Prvclass {

	private char[] st_one;

	Nestedclass() {
		String st_one = "String_one";
	}
	static class NestInner extends PrvClassCall{
		final String str_in = "Nested Inner class";
	}
	
	public static void main(String[] args) {
		Nestedclass nc = new Nestedclass();
		Nestedclass.NestInner nc_in = new Nestedclass.NestInner();
		System.out.println(nc_in.str_in);
		System.out.println("Change the private class variable in PRVCLASS");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for changing : ");
		String str_ch = sc.next();
		nc.setcls(str_ch);
		System.out.println(nc.getcls());
		System.out.println(nc.st_one);
	}

}

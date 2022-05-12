package test_basic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CheckVowel {
	String sclass = "abcd";
	public static boolean check(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");	
	}
	public static void main(String[] args) {
		CheckVowel cv = new CheckVowel();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the word to check: ");
//		String s1 = sc.next();
		System.out.println(check(cv.sclass));
	}

}

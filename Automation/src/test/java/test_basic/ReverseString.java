package test_basic;

import java.util.Scanner;

public class ReverseString {

	public static Object reverse(String in) {
		StringBuilder out = new StringBuilder();
		for(int i=in.length()-1;i>-1;i--){
			out.append(in.charAt(i));
		}
		return out.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		Object reverse_str = reverse(str);
		System.out.println("The reverse string is "+ reverse_str);
//		Below method is to check whether it is palindrome
		if(str.equals(reverse_str)){
			System.out.println("The string is palindrome");
		}else {
			System.out.println("The string is not palindrome");
		}
		
	}

}

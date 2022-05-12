package test_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicTest {

	public static void main(String[] args) throws Exception, IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int var_int = Integer.parseInt(br.readLine());
		var_int += 10;
		System.out.println("Entered number: ");
		System.out.println(var_int);
		System.out.println("Enter the string: ");
		String var_str = sc.next();
		System.out.println("Entered string: "+ var_str);
	}

}

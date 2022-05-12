package test_basic;
import java.util.Scanner;

import test_basic.Prvclass;

public class PrvClassCall extends Prvclass{

	public static void main(String[] args) {
		PrvClassCall prcall = new PrvClassCall();
		prcall.getcls();
		System.out.println("Enter the value to update on private variable");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();	
		prcall.setcls(str);
		System.out.println(prcall.getcls());
	}
}

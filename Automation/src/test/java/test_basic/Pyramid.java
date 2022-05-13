package test_basic;

public class Pyramid {

	public static void main(String[] args) {
		String a = "*";
		
		for(int i=0;i<=5;i++) {
			String b = "";
			for(int j=0;j<=i;j++) {
				b += "*";	
			}
			System.out.println(b);
		}
		System.out.println();
		for(int i=5;i>=0;i--) {
			String b = "";
			for(int j=0;j<=i;j++) {
				b += "*";
			}
			System.out.println(b);
		}

		for(int i=0;i<=5;i++) {
			int n = 5 - i;
			String b = "";
			for(int k=0;k<n;k++) {
				b += " ";
			}
			for(int j=n;j<=5;j++) {
				b += "*";
			}
			System.out.println(b);
		}
		System.out.println();
		for(int i=5;i>=0;i--) {
			int n = 5 - i;
			String b = "";
			for(int k=0;k<n;k++) {
				b += " ";
			}
			for(int j=n;j<=5;j++) {
				b += "*";
			}
			System.out.println(b);
		}

		for(int i=0;i<=5;i++) {
			int n = 5 - i;
			String b = "";
			for(int k=0;k<n;k++) {
				b += " ";
			}
			for(int j=n;j<=5;j++) {
				b += "* ";
			}
			System.out.println(b);
		}
	}

}

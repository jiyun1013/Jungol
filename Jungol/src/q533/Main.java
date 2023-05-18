package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		char s = sc.next().charAt(0);
		int a = sc.nextInt();
		sc.close();

		if (s == 'M' && a >= 18) {
			System.out.println("MAN");
		} else if (s == 'F' && a >= 18) {
			System.out.println("WOMAN");
		} else if (s == 'M' && a < 18) {
			System.out.println("BOY");
		} else if (s == 'F' && a < 18) {
			System.out.println("GIRL");
		}

		if (a >= 18) {
			if (s == 'M') {
				System.out.println("Man");
			} else if (s == 'F') {
				System.out.println("WOMAN");
			}
		} else {
			if (s == 'M') {
				System.out.println("BOY");
			} else if (s == 'F') {
				System.out.println("GIRL");
			}
		}
	}
}
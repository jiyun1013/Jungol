package q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c1 = 0;

		while (true) {
			c1 = sc.next().charAt(0);

			// 2.
			if (Character.isAlphabetic(c1)) {
				System.out.println(c1);
			} else if (Character.isDigit(c1)) {
				System.out.println((int) c1);
			} else {
				break;
			}

			// 1.
			if (c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z') {
				System.out.println(c1);
			} else if (c1 >= '0' && c1 <= '9') {
				System.out.printf("%d\n", (int) c1);
			} else {
				break;
			}
		}
		sc.close();
	}
}
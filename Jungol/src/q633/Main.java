package q633;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		do {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");

			num = sc.nextInt();
			System.out.println();
			switch (num) {
			case 1:
				System.out.println("Seoul\n");
				break;
			case 2:
				System.out.println("Washington\n");
				break;
			case 3:
				System.out.println("Tokyo\n");
				break;
			case 4:
				System.out.println("Beijing\n");
				break;
			}
		} while (num > 0 && num < 5);
		System.out.println("none");
		sc.close();
	}
}
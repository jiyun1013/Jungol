package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char E = sc.next().charAt(0);
		sc.close();

		if (E == 'A') {
			System.out.println("Excellent");
		} else if (E == 'B') {
			System.out.println("Good");
		} else if (E == 'C') {
			System.out.println("Usually");
		} else if (E == 'D') {
			System.out.println("Effort");
		} else if (E == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}
}
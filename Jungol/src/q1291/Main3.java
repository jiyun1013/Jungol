package q1291;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0, e = 0;

		do {
			s = sc.nextInt();
			e = sc.nextInt();

			if ((2 <= s && s <= 9) && (2 <= e && e <= 9)) {
				break;
			}
			System.out.println("INPUT ERROR!");
		} while (true);
		sc.close();

		if (s <= e) {
			for (int i = s; i <= e; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
			}
		} else {
			for (int i = s; i <= e; i--) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
			}
		}
		
	}
}
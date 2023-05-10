package q1291;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			if (s >= 2 && s <= 9 && e >= 2 && e <= 9) {
				if (s < e) {
					for (int i = 1; i <= 9; i++) {
						for (int s2 = s; s2 <= e; s2++) {
							System.out.printf("%d * %d = %2d   ", s2, i, (s2 * i));
						}
						System.out.println();
					}
				} else if (s >= e) {
					for (int i2 = 1; i2 <= 9; i2++) {
						for (int s3 = s; s3 >= e; s3--) {
							System.out.printf("%d * %d = %2d    ", s3, i2, (s3 * i2));
						}
						System.out.println();
					}
				}
				break;
			} else {
				System.out.println("INPUT ERROR!");
			}
		}
		sc.close();
	}
}
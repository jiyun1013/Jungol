package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar = sc.nextInt();
		int[] num = new int[100];

		do {
			for (int i = 0; i <= num.length; i++) {
				for (int j = i; j >= 0; j--) {
					System.out.println(num[ar]);
				}
			}
		} while (ar != 0);
		sc.close();
	}
}
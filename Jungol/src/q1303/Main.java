package q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print((sum += 1) + " ");
			}
			System.out.println();
		}
	}
}
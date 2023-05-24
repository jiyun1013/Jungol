package q571;

import java.util.Scanner;

public class Ma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		MaOb mo = new MaOb();
		for (int i = 0; i < n; i++) {
			mo.printStr();
		}
	}
}
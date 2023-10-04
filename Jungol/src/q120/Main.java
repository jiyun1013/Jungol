package q120;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		// 2.
		System.out.println(Math.abs(n1 - n2));

		// 1.
		int sco = (n1 > n2) ? n1 - n2 : n2 - n1;
		System.out.println(sco);
	}
}
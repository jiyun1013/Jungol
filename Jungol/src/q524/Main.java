package q524;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

//		System.out.print(n1 * n2 != 0);
//		System.out.print(" ");
//		System.out.print(n1 + n2 != 0);

		boolean b1 = n1 != 0;
		boolean b2 = n2 != 0;
		System.out.println((b1 && b2) + " " + (b1 || b2));
	}
}
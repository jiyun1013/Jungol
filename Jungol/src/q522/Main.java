package q522;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		if (n1 == n2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (n1 != n2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		System.out.println("------------");

		int a = (n1 == n2) ? 1 : 0;
		int b = (n1 != n2) ? 1 : 0;

		System.out.println(a);
		System.out.println(b);

		System.out.println("------------");

		boolean r = n1 == n2;
		System.out.println(r);
		System.out.println(!r);

		System.out.println("------------");

		boolean q = (n1 == n2) ? true : false;
		String w = (n1 != n2) ? "true" : "false";
		System.out.println(q);
		System.out.println(w);
	}
}
package q115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int w1 = sc.nextInt();
		int h2 = sc.nextInt();
		int w2 = sc.nextInt();
		sc.close();

		boolean b = (h1 > h2 && w1 > w2);
		System.out.println(b);
	}
}
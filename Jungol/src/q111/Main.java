package q111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int sum = k + e + m + c;

		System.out.println("sum " + sum);
		System.out.println("avg " +(sum / 4));
	}
}
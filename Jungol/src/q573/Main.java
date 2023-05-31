package q573;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Mainnum num = new Mainnum();
		num.n = n;

		num.getN();

	}
}
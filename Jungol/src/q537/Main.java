package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int z = 0;
		sc.close();

		if (num <= 100)
			for (int p = 1; p <= num; p++) {
				z += p;
			}
		System.out.println(z);
	}
}
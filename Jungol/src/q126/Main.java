package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int odd = 0;
		int even = 0;
		do {
			num = sc.nextInt();
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		} while (num != 0);
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + (even - 1));
	}
}
package q128;

import java.util.Scanner;

public class rightAnswer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cnt = 0;

		do {
			num = sc.nextInt();
			if (num % 3 != 0 && num % 5 != 0) {
				cnt++;
			}
		} while (num != 0);
		sc.close();

		System.out.println(cnt);
	}

}

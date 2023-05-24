package q126;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10000];

		int idx = 0;
		int odd = 0, even = 0;
		do {
			ar[idx] = sc.nextInt();
			if (ar[idx] == 0) {
				break;
			} else if (ar[idx] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			idx++;
		} while (true);
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
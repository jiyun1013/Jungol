package q560;

import java.util.Scanner;

public class Ma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int i = 0;
		int min = ar[0];
		do {
			min = (min <= ar[i]) ? min : ar[i];
		} while (i++ < ar.length - 1);
		System.out.println(min);
	}
}
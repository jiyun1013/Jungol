package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int min = 0;
		int max = 10000;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

			if (ar[i] > 0 && ar[i] < 100) {
				min = (min < ar[i]) ? ar[i] : min;
			}
			if (ar[i] >= 100 && ar[i] < 10000) {
				max = (max < ar[i]) ? max : ar[i];
			}
		}
		sc.close();
		if (min == 0) {
			min = 100;
		}
		if (max == 10000) {
			max = 100;
		}
		System.out.println(min + " " + max);
	}
}
package q562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int sum = 0;
		int av = 0;
		double avg = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (i % 2 != 0) {
				sum += ar[i];
			} else {
				av += ar[i];
			}
		}
		avg = (double) av / 5;
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : " + "%.1f", avg);
	}
}
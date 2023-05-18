package q562;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int sumOdd = 0, sumEven = 0;
		for (int i = 1; i < arr.length; i += 2) {
			sumOdd += arr[i];
			sumEven += arr[i - 1];
		}
		System.out.printf("sum : %d\navg : %.1f", sumOdd, (double) sumEven / 5);
	}
}
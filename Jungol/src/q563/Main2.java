package q563;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		

		for (int j = 0; j < ar.length; j++) {
			int max = Integer.MIN_VALUE; // int로 나올 수 있는 값 중 가장 작은 값
			int idx = 0;
			for (int i = 0; i < ar.length; i++) {
				if (max < ar[i]) {
					max = ar[i];
					idx = i;
				}
			}
			System.out.print(max + " ");
			ar[idx] = -1;

			for (int k = 0; k < ar.length; k++) {
			}
		}
	}
}
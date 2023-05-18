package q558;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		int inp = 0, idx = 0;

		do {
			inp = sc.nextInt();
			ar[idx++] = inp;
		} while (inp != 0);
		sc.close();

//		for (int i = 0; i < idx; i++) {
//			System.out.print(ar[i] + " ");
//		}

		for (int i = idx - 2; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
	}
}
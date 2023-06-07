package q632;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2.
		int[] inp = new int[3];
		int max = Integer.MAX_VALUE;
		int min = 0;
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

//			if (inp[i] < max) {
//				min = inp[i];
//			}
		}
		System.out.println(min);

		// 1.
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		int small = 0;
		small = (n1 < n2) ? n1 : n2;
		small = (small < n3) ? small : n3;

		System.out.println(small);
	}
}
package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		int i = 0;
//		int min = ar[0];
////		int min = (ar[0] <= ar[1]) ? ar[0] : ar[1];
//		while (i < ar.length) {
//			min = (min <= ar[i++]) ? min : ar[i++];
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println(min);
	}
//		min = (min <= ar[2]) ? min : ar[2];
//		min = (min <= ar[3]) ? min : ar[3];
//		min = (min <= ar[4]) ? min : ar[4];
//		min = (min <= ar[5]) ? min : ar[5];
//		min = (min <= ar[6]) ? min : ar[6];
//		min = (min <= ar[7]) ? min : ar[7];
//		min = (min <= ar[8]) ? min : ar[8];
//		min = (min <= ar[9]) ? min : ar[9];
}
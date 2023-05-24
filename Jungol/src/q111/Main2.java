package q111;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		sc.close();

		System.out.println("sum " + sum);
		System.out.println("avg " + sum / score.length);
	}
}
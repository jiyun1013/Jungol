package q1870;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(N + " " + M);
		int[][] check = new int[N][M];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				check[i][j] = sc.nextInt();
				System.out.print("check[" + i + "][" + j + "] : " + check[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

		while (true) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					
					if (check[i][j] == 1) {
						if (check[--i][j] == 1) {
							check[i][j] -= 1;
						}
						if (check[++i][j] == 1) {
							check[i][j] -= 1;
						}
						if (check[i][--j] == 1) {
							check[i][j] -= 1;
						}
						if (check[i][++j] == 1) {
							check[i][j] -= 1;
						}

						System.out.print("check[" + i + "][" + j + "] : " + check[i][j] + " ");
					}
				}
			}
			System.out.println("----------");
		}
	}
}
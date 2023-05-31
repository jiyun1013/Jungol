package q573;

import java.util.Scanner;

public class Main2 {
	public static void numRect(int n) { // 정의부(메소드를 정의하는 부분)
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		numRect(inp); // 메소드 호출부 n=inp로 만들어줌
	}
}
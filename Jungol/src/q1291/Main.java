package q1291;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int s = sc.nextInt(); //sc.를 안에다 넣어야 무한루프 입력 가능
			int e = sc.nextInt();
			if (s >= 2 && s <= 9 && e >= 2 && e <= 9) {
				if (s < e) {
					for (; s <= e; s++)
						for (int i = 1; i <= 9; i++) {
							System.out.println(s + " * " + i + " = " + (s * i));
						}
				} else if (s >= e) {
					for (; s >= e; s--)
						for (int i2 = 1; i2 <= 9; i2++) {
							System.out.println(s + " * " + i2 + " = " + (s * i2));
						}
				}
				break;
			} else {
				System.out.println("INPUT ERROR!");
			}
		}
		sc.close();
	}
}
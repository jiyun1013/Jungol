package q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Mainf ma = new Mainf();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;

		ma.setNum(num);
		ma.print();
//		do {
//			num = sc.nextInt();
//			if (num % 3 != 0 && num % 5 != 0) {
//			}
//		} while (num != 0);
		sc.close();

		System.out.println(cnt);
	}
}
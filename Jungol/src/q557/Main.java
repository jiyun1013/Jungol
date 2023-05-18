package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char num[] = new char[10];

		for (int m = 0; m < 10; m++) {
			num[m] = sc.next().charAt(0);
			switch (m) {
			case 0:
//				System.out.print(num[m] + " ");
//				break;
			case 3:
//				System.out.print(num[m] + " ");
//				break;
			case 6:
				System.out.print(num[m] + " ");
				break;
//			case 0, 3, 6:
//				System.out.print(num[m] + " ");
//				break;  으로도 가능
			}
		}
		sc.close();
	}
}
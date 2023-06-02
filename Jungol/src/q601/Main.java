package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		int k = 0;
		int j = 0;

		for (int i = str.length() - 1; i > 0; i--) {
			for (j = i; j < str.length(); j++) {
				System.out.print(str.charAt(j));
			}
			if (j >= str.length()) {
				for (k = 0; k < i; k++) {
					System.out.print(str.charAt(k));
				}
			}
			System.out.println();
		}
		System.out.println(str);

//		문제 잘못 읽어서 푼 부분
//		for (int i = 1; i <= str.length(); i++) {
//			for (j = i; j < str.length(); j++) {
//				System.out.print(j);
//			}
//			if (j >= str.length()) {
//				for (k = 0; k < i; k++) {
//					System.out.print(k);
//				}
//			}
//			System.out.println();
//		}
	}
}
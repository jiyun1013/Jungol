package q596;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			if (--num == 0) {
				break;
			}
		}
	}
}
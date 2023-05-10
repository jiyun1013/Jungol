package q557;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] num = new char[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.next().charAt(0);
		}
		System.out.print(num[0] + " " + num[3] + " " + num[6]);

		sc.close();
	}
}
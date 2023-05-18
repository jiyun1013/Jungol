package q596;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = sc.nextInt();
		sc.close();

		n = (s.length() < n) ? s.length() : n;
		for (int i = s.length() - 1; i >= s.length() - n; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
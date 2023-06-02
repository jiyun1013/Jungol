package q601;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		String inp2 = inp + inp;

		for (int i = inp.length() - 1; i >= 0; i--) {
			System.out.println(inp2.substring(i, i + inp.length()));
		}
	}
}
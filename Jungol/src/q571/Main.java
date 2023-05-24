package q571;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Mainf stri = new Mainf();
		sc.close();

		stri.run(num);
	}
}
package q9015;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("두 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		

	}
}
package q532;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		sc.close();

		if (n1 >= 4.0 && n2 >= 4.0) {
			System.out.println("A");
		} else if (n1 >= 3.0 && n2 > 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
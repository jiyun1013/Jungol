package q110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double y = sc.nextDouble();
		sc.close();
		double x = y * 91.44;
//		System.out.print(y+"yard = ");
//		System.out.printf("%.1f",x);
//		System.out.print("cm");
		System.out.printf(y + "yard = " + "%.1f" + "cm", x);
//		System.out.printf(y + "yard = " + "%s", x + "cm");
	}
}
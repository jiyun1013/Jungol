package q109;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		sc.close();
		
		int sum= i1+i2+i3;
		System.out.printf("sum = " + (i1 + i2 + i3));
		System.out.printf("\nsum = %d ", sum);
	}
}
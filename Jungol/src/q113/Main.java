package q113;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();

		w += 5;
		h *= 2;
		System.out.println("width = " + w + "\nlength = " + h + "\narea = " + (w * h));
	}
}
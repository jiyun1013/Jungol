package q521;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

//		n1++;
//		--n2;
		int res = n1++ * --n2;
		System.out.print(n1 + " " + n2 + " " + res);
	}
}
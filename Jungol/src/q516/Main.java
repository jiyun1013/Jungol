package q516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		char c1 = sc.next().charAt(0);
//      string s1 = sc.next(); 는 가능한데 nextLine 불가능
//		원래는 되는데 여기선 안되네 뭐가 충돌나나?
		sc.close();

		System.out.printf("%.2f\n%.2f\n",d1,d2);
		System.out.print(c1);
	}
}
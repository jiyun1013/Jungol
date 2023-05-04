package q518;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		while (cnt < 3) {
			int inp4 = sc.nextInt();
			sum += inp4;
			cnt++;
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum / cnt));
		sc.close();
	}
}
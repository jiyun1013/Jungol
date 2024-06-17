package q9064;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArr[] = new int[5];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
			System.out.print(intArr[i] + " ");
		}
		sc.close();
//		System.out.println(Arrays.toString(intArr));	문제에서 원하는 형식이 아니었다
	}
}
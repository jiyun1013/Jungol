package q558;

import java.util.Scanner;

public class Main3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 0)
				break;
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0)
				System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
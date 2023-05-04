package q518;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i]+" ");
		}
		sc.close();

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		int sum = 0;
		for (int i=0;i<num.length;i++) {
			sum += num[i];  //합계
		}
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+(sum/num.length));
	}
}

package q515;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		//1. x>=y
		if(x>=y) {
			System.out.println(x + " * " + y + " = " + x * y);
			System.out.println(x + " / " + y + " = " + x / y);
		}else {
		//2. x<y
			//2-1.
			System.out.println(y + " * " + x + " = " + y * x);
			System.out.println(y + " / " + x + " = " + y / x);
			//2-2.
			int m = y - x;
			y = y - m;
			x = x + m;
			System.out.println(x + " * " + y + " = " + x * y);
			System.out.println(x + " / " + y + " = " + x / y);
			//2-3. 'swap' : 임시 저장공간을 하나 더 만들겠다
			int tmp = x;
			x = y;
			y = tmp;
			System.out.println(x + " * " + y + " = " + x * y);
			System.out.println(x + " / " + y + " = " + x / y);
			
		}
		
		
		
		
//		System.out.println(x + " * " + y + " = " + x * y);
//		System.out.println(x + " / " + y + " = " + x / y);
		sc.close();
	}
	
}
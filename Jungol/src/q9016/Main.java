package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요. ");
		int h = sc.nextInt();
		System.out.print("몸무게를 입력하세요. ");
		double w = sc.nextDouble();
		System.out.print("이름을 입력하세요. ");
		char n = sc.next().charAt(0);
		sc.close();
		
		System.out.println("키 = "+h);
//		System.out.printf("몸무게 = "+"%.1f",w); 아래랑 같은 말
		System.out.printf("몸무게 = %.1f",w);
		System.out.println("\n이름 = "+n);
	}
}
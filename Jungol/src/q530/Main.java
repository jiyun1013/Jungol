package q530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a>=20) {
			System.out.println("adult");
		}else {
			System.out.println(20-a+" years later");
		}
	}
}
package q519;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		n1+=100;
		n2%=10;
		
		System.out.print(n1+" "+n2);
		sc.close();
	}
}
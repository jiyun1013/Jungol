package q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] alp = new char[10];
//		alp[0] = sc.next().charAt(0);
		for(int i = 0; i<alp.length;i++) {
			alp[i]=sc.next().charAt(0);
			System.out.print(alp[i]);
		}
		sc.close();
	}
}
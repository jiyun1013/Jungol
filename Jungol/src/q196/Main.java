package q196;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		People peopleset = new People();
		String[] per1 = new String[3];
		String[] per2 = new String[3];
		String[] per3 = new String[3];

		for (int i = 0; i < per1.length; i++) {
			per1[i] = sc.next();
		}
		for (int i = 0; i < per2.length; i++) {
			per2[i] = sc.next();
		}
		for (int i = 0; i < per3.length; i++) {
			per3[i] = sc.next();
		}
		
		peopleset.setPeople(per1[0],per1[1], per1[2]);
		peopleset.setPeople(per2[0],per2[1], per2[2]);
		peopleset.setPeople(per3[0],per3[1], per3[2]);
		
		char A = per1[0].charAt(0);
		char B = per2[0].charAt(0);
		char C = per3[0].charAt(0);
		
		if('A'<'B') {
//			System.out.println(per1[]);
		}
	}
}
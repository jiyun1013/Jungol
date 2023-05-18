package q534;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		char al = str.charAt(0);   아래랑 같은말
		char al = sc.next().charAt(0);
		sc.close();
		
		switch(al) {
			case 65:
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 67:
				System.out.println("Usually");
				break;
			case 68:
				System.out.println("Effort");
				break;
			case 69:
				System.out.println("Failure");
				break;
			default:
				System.out.println("error");
		}
	}
}
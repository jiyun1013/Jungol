package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MainF ne = new MainF();
		System.out.println(ne.Grade + " grade in " + ne.School + " School");

		MainF ne2 = new MainF();
		ne2.School = sc.next();
		ne2.Grade = sc.nextInt();
		System.out.println(ne2.Grade + " grade in " + ne2.School + " School");

		MainF ne3 = new MainF("jiyun", 5);
		System.out.println(ne3.Grade + " grade in " + ne3.School + " School");

		sc.close();
	}
}
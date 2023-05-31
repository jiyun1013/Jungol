package q196;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String adrs = sc.next();
		People2 p1 = new People2 (name, tel, adrs);

		name = sc.next();
		tel = sc.next();
		adrs = sc.next();
		People2 p2 = new People2 (name, tel, adrs);

		name = sc.next();
		tel = sc.next();
		adrs = sc.next();
		People2 p3 = new People2 (name, tel, adrs);
		sc.close();
		
		if (p1.getFirstName() < p2.getFirstName()) {
			if (p2.getFirstName() < p3.getFirstName()) {
				p1.print();
			} else {
				p3.print();
			}
		} else {
			if (p2.getFirstName() < p3.getFirstName()) {
				p2.print();
			} else {
				p3.print();
			}
		}
	}
}
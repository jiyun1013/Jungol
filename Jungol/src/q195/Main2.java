package q195;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		sc.close();
		
		Mainf2 p1= new Mainf2(name, tel, addr);
		p1.print();
	}
}
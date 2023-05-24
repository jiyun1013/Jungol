package q195;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		sc.close();

		Mainf people = new Mainf();

		people.setName(name);
		people.setTel(tel);
		people.setAddr(addr);

//		people.name = name;  이건 필드값을 변경하는거
//		people.tel = tel;
//		people.addr = addr;

		System.out.println("name : " + people.getName());
		System.out.println("tel : " + people.getTel());
		System.out.println("addr : " + people.getAddr());
	}
}
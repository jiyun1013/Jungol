package q613;

import java.util.Scanner;

//class MaFi {   파일 하나로 만드려면 이렇게 추가
//	String Name;
//	String School;
//	int Grade;
//}

public class Ma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaFi de = new MaFi();
		MaFi fa = new MaFi();

		de.Name = sc.next();
		de.School = sc.next();
		de.Grade = sc.nextInt();

		fa.Name = sc.next();
		fa.School = sc.next();
		fa.Grade = sc.nextInt();

		sc.close();

		System.out.println("Name : " + de.Name);
		System.out.println("School : " + de.School);
		System.out.println("Grade : " + de.Grade);
		System.out.println();

		System.out.println("Name : " + fa.Name);
		System.out.println("School : " + fa.School);
		System.out.println("Grade : " + fa.Grade);
	}
}
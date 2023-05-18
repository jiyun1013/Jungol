package q613;

import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		String School = sc.next();
		int Grade = sc.nextInt();

//		생성자이용
		MF de = new MF(Name, School, Grade);

//		생성자 없이 생성
//		MF de = new MF();
//		de.Name = sc.next();
//		de.School = sc.next();
//		de.Grade = sc.nextInt();

//		MF fa = new MF();
		Name = sc.next();
		School = sc.next();
		Grade = sc.nextInt();

		MF fa = new MF(Name, School, Grade);
		
		fa.Name = Name;
		fa.School = School;
		fa.Grade = Grade;

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
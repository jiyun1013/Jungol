package q614;

import java.util.Scanner;

public class Ma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

		MaF s1 = new MaF("Jejuelementary", 6);
		MaF s2 = new MaF(school, grade);

		System.out.println(s1.grade + " grade in " + s1.school + " School");
		System.out.println(s2.grade + " grade in " + s2.school + " School");
	}
}
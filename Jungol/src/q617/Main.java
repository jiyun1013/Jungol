package q617;

import java.util.Arrays;
import java.util.Scanner;

class People implements Comparable {
	private String name;
	private int height;

	public People(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void print() {
		System.out.println(name + " " + height);
	}

	@Override
	public int compareTo(Object o) {
		People p = (People) o;
		if (this.height < p.height) {
			return -1;
		} else if (this.height == p.height) {
			return 0;
		} else {
			return 1;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//      String[] ar = new String[5];
//      int[] num = new int[5];
//      String[] sum = new String[5];
		Person[] p = new Person[5];

		for (int i = 0; i < 5; i++) {
//         ar[i] = sc.next();
//         num[i] = sc.nextInt();
//         sum[i] = ar[i] + " " + num[i];
			String name = sc.next();
			int height = sc.nextInt();
			p[i] = new Person(name, height);
		}
		sc.close();

		Arrays.sort(p);
		p[0].print();
	}
}
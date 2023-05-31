package q196;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Person[] p = new Person[3];
	      for (int i = 0; i < p.length; i++) {
	         String name = sc.next();
	         String tel = sc.next();
	         String adrs = sc.next();
	         p[i] = new Person(name, tel, adrs);
	      }
	      sc.close();

	      for (int i = 0; i < p.length; i++) {
	         p[i].print();
	      }

	      Arrays.sort(p);
	      System.out.println("--------------------");
	      for (int i = 0; i < p.length; i++) {
	         p[i].print();
	      }
	   }
	}
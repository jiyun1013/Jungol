package q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		scan.close();
		
//		System.out.println(h);
//		System.out.println(w);
		
		if(w+100-h>0) {
			System.out.print(w+100-h+"\nObesity");
		}else{
			System.out.print(w+100-h);
		}
	}
}
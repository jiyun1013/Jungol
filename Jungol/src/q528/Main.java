package q528;

import java.util.Scanner;  //컨트롤+쉬프트+o


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number=sc.nextInt();
		sc.close();
		
		if( number >= 0) {
			System.out.print(number);
		}else {
			System.out.print(number+"\nminus");
			
		}
	}
}
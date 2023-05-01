package q528;

import java.util.Scanner;  //컨트롤+쉬프트+O

public class refactoring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number=sc.nextInt();
		sc.close();
		System.out.print(number);
		
		if( number >= 0) {
		}else {
			System.out.print("\nminus");
		}
	}
}
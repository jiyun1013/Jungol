package q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int t=sc.nextInt();
			if(t%3==0) {
				System.out.println(t/3);
			}else if(t==-1) {
				break;
			}
		}
		sc.close(); //무한에서는 클로즈 불가, break 통해서 멈추고 닫아야함
	}
}
package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		// case 2
		StringTokenizer st = new StringTokenizer(str);
		int n = st.countTokens();
		System.out.println(n);

		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		// case 1
//		int cnt = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 32) {
//				// str.charAt(i) == ' ' 도 가능
//				cnt++;
//			}
//		}
//		System.out.println(cnt + 1);
	}
}
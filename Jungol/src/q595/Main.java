package q595;

public class Main {
	public static void main(String[] args) {
		String S = "Hong Gil Dong";

		System.out.println(S.substring(3, 7));

		System.out.print(S.charAt(3));
		System.out.print(S.charAt(4));
		System.out.print(S.charAt(5));
		System.out.println(S.charAt(6));

		for (int i = 3; i < 7; i++) {
			System.out.print(S.charAt(i));
		}
	}
}
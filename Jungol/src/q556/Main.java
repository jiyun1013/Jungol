package q556;

public class Main {
	public static void main(String[] args) {
		//1.
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}
		
		//2.
		int num2[] = new int[10];
		for (int a = 0; a < num2.length; a++) {
			num2[a] = a + 1;
			System.out.print(num2[a]);
			if (a <= num2.length - 2) {
				System.out.print(" ");
			}
		}
	}
}
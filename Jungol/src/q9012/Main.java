package q9012;

public class Main {
	public static void main(String[] args) {
		int n1 = 5;
		double n2 = 3.140000;

		System.out.printf("원주 = %d * %d * %.6f = %.6f", n1, 2, n2, (n1 * 2 * n2));
		System.out.printf("\n넓이 = %d * %d * %.6f = %.6f", n1, n1, n2, (n1 * n1 * n2));
	}
}
package q9013;

public class Main {
	public static void main(String[] args) {
		double x = 1.234;
		double y = 10.3459;

		System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");
		System.out.printf("x = %7.4f", x);
		System.out.printf("\ny = %7.4f", y);
		System.out.println("\n\n소수 2자리까지 출력(반올림)");
		System.out.printf("x = %.2f", x);
		System.out.printf("\ny = %.2f", y);
	}
}
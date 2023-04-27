package q9006;

public class Main {
	public static void main(String[] args) {
		//1
		System.out.println("수를 출력할 때는 따옴표를 생략합니다.\n123\n6.500000");
		
		//2
		System.out.println("수를 출력할 때는 따옴표를 생략합니다.");
		System.out.println(123);
		System.out.print(6.500000);
		
		double d1 = 6.5;
		double d2 = 1236.5078;
		System.out.println(d1);
		System.out.printf("%f\n",d1);
		System.out.printf("%.3f\n",d1);
		System.out.printf("%10.3f\n",d1);
		System.out.printf("%10.3f\n",d2); //소수점으로 표현할 때 반올림함
	}
}
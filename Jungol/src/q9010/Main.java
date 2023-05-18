package q9010;

public class Main {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 0;

		z = x;
		x = y;
		y = z;

		System.out.print(x+" "+y);
	}
}
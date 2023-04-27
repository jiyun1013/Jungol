package q512;

public class Main {
	public static void main(String[] args) {
		int x =49; 
		double y=0.2683;
		float fy=0.2683f;
		
//		System.out.printf(x+" * "+y+"%.6f\n"+" = "+"%.7f\n",(x*y));

		//1
		System.out.printf("%d * %f = %f\n", x, y, x*y);
		
		//2
		System.out.print(x+ " * ");
		System.out.printf("%f = %f\n", y,(x*y));
//		System.out.print(x + " * "+y+ " = "+(x*y));
		
		//3
		System.out.printf("%d * %f = %f\n",x,fy,x*fy);
	}
}

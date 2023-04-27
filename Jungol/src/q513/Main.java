package q513;

public class Main {

	public static void main(String[] args) {
		double yd = 91.44;
		double in = 2.54;
		double x = 2.1;
		double y = 10.5;
		
		System.out.printf("%4.1fyd = %5.1fcm\n",2.1,2.1*yd);
		System.out.printf("%4.1fin = %5.1fcm",10.5,10.5*in);
		
		//
		System.out.printf("\n%4.1fyd = %5.1fcm\n",x,x*yd);
		System.out.printf("%4.1fin = %5.1fcm",y,y*in);
	}
}
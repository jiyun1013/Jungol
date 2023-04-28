package q9008;

public class Main {
	public static void main(String[] args) {
		String s1 = "subject score", s2 = "korean", s3 = "english", s4 = "computer";
		String s5 = "90", s6 = "100", s7 = "80";
		
		System.out.printf("%14s",s1);
		System.out.println("\n==============");
		System.out.printf("%8s%6s",s2,s5);
		System.out.printf("\n%8s%6s",s3,s6);
		System.out.printf("\n%8s%6s",s4,s7);
		
		//
		System.out.println("\n subject score");
		System.out.println("==============");
		System.out.println("  korean    90");
		System.out.println(" english   100");
		System.out.println("computer    80");
	}
}
package q508;

public class Main {
	public static void main(String[] args) {
		//first
		System.out.printf("%10s%10s%10s\n","item","count","price");
		System.out.printf("%10s%10s%10s\n","pen","20","100");
		System.out.printf("%10s%10s%10s\n","note",5,95);
		System.out.printf("%10s%10s%10s\n","eraser","110",97);
		
		//second
		String s1="item", s2="count", s3="price";
		System.out.printf("%10s%10s%10s\n",s1,s2,s3);
				
		s1="pen"; s2="20"; s3="100";
		System.out.printf("%10s%10s%10s\n",s1,s2,s3);
						
		s1="note"; s2="5"; s3="95";
		System.out.printf("%10s%10s%10s\n",s1,s2,s3);
				
		s1="eraser"; s2="110"; s3="97";
		System.out.printf("%10s%10s%10s\n",s1,s2,s3);
	}
}
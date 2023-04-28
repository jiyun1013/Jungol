package q536;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 15) {
			System.out.print(i);
			i++;
		}
		
		for(i=1;i<=15;i++) {
			System.out.print(i);
			break;
		}
		
		do {System.out.println(i++);}while(i<=15);
	}
}

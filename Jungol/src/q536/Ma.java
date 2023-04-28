package q536;

public class Ma {
	public static void main(String[] args) {
		//1. for문
		for(int i = 1; i <16; i++) {
//			System.out.print(i+" ");
			System.out.print(i);
			if(i<15) {
				System.out.print(" ");
			}
			
			
		}
		System.out.println();
		
		//2. while문
		int j =1;
		while(j < 16) {
			System.out.print(j++ + " ");
		}
		
		//3. do~while문
		int k = 1;
		do {
			System.out.print(k++ + " ");
		}while(k < 16);
	}

}

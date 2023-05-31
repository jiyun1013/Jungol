package q573;

public class Mainnum {
	int n;

	Mainnum() {
	}

	public Mainnum(int n) {
		this.n = n;
	}

	public int getN() {
		int nu = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(nu++ + " ");
			}
			System.out.println();
		}

		return n;
	}

	public void setN(int n) {
		if (n < 100) {
			this.n = n;
		}
	}
}

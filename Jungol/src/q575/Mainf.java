package q575;

public class Mainf {
	private int n1;
	private int n2;
	private int po;

	public int getN() {
		return po;
	}

	public void setN(int n1, int n2) {
		if (n1 <= 10) {this.n1 = n1;}
		if (n2 <= 10) {this.n2 = n2;}
		this.po = po;

		po = (int) Math.pow(n1, n2);
	}

	void print() {
		System.out.println(getN());
	}
}
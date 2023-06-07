package q574;

public class Mainf {
	private int num1;
	private int num2;
	private int num3;
	private int BigNum;

	public int getNum() {
		return BigNum;
	}

	public void setNem(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.BigNum = BigNum;

		BigNum = Math.max(num1, num2);
		BigNum = Math.max(BigNum, num3);
	}

	void print() {
		System.out.println(getNum());
	}
}
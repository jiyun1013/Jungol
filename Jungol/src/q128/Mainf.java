package q128;

public class Mainf {
	private int num;
	private int cnt;

	public int getNum() {
		return num;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public void setNum(int num) {
		this.num = num;
		do {
			if(num % 3 != 0 && num % 5 != 0) {
				cnt++;
			}
		}while(num != 0);
	}

	public int getCnt() {
		return cnt;
	}

	void print() {
		System.out.println(getNum());
	}
}
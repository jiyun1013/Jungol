package q571;

public class Mainf {
	String str;
	int num;

	Mainf() {
		str = "~!@#$^&*()_+|";
		num = 0;
	}

	void run(int num) {
		this.num = num;
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
}
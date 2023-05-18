package q616;

public class MainF {
	int x1, y1;
	int x2, y2;
	int x3, y3;

	MainF() {
	}

	public MainF(int px1, int py1, int px2, int py2, int px3, int py3) {
		x1 = px1;
		y1 = py1;
		x2 = px2;
		y2 = py2;
		x3 = px3;
		y3 = py3;
	}

	public double getCogX() {
		double res = (x1 + x2 + x3) / (double) 3;
		return res;
	}

	public double getCogY() {
		double res = (y1 + y2 + y3) / (double) 3;
		return res;
	}
}
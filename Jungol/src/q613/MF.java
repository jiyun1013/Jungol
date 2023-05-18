package q613;

public class MF { //2. 간접적으로 여기 값을 따옴
	String Name;  //왜? -> 잠궈놓고 값 고정시키려고
	String School;
	int Grade;

	MF() {
	}

	MF(String N, String S, int G) { //1. 여기를 통해서
		Name = N;
		School = S;
		Grade = G;
	}
}
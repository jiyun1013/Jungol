package q196;

public class People2 {
	private String name;
	private String tel;
	private String addr;

	public People2(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public void print() {
		System.out.println(name + " " + tel + " " + addr);
	}

	public char getFirstName() {
		return name.charAt(0);
	}

}
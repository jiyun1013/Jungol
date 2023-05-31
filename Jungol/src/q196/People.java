package q196;

public class People {
	String name;
	String tel;
	String addr;

	public People() {
	}
	
	public void getPeople(){
		return;
	}

	public void setPeople(String name, String tel, String addr) {
		if (name.length() <= 15 && tel.length() <= 15 && addr.length() <= 15) {
			this.name = name;
			this.tel = tel;
			this.addr = addr;
		}
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}
}
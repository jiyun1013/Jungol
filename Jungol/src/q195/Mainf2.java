package q195;

public class Mainf2 {
	private String name;
	private String tel;
	private String addr;

	public Mainf2(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public void setName(String name) {
		if (name.length() <= 100) {
			this.name = name;
		}
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}
}
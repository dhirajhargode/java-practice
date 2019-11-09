package serv;

public class MyBean {
	private String msg;

	public MyBean() {
		System.out.println("constructor======called");
	}

	public String getMsg() {
		System.out.println("getMsg()======called");
		return msg;
	}

	public void setMsg(String msg) {
		System.out.println("setMsg()======called");
		this.msg = msg;
	}
	
}

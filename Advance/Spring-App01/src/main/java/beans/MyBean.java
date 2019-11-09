package beans;

public class MyBean {

	private String msg;

	public MyBean() {
		System.out.println("Constructor()===>");
	}

	public String getMsg() {
		System.out.println("Getter()===>");
		return msg;
	}

	public void setMsg(String msg) {
		System.out.println("Setter()===>");
		this.msg = msg;
	}

}

package beans;

public class MyDao {

	private MyTemplate mt;

	public MyDao() {
	}

	public MyDao(MyTemplate mt) {
		this.mt = mt;
	}

	public void setMt(MyTemplate mt) {
		this.mt = mt;
	}

	public MyTemplate getMt() {
		return mt;
	}

	public void add() {
		System.out.println("MyDao Add()");
		mt.insert();

	}

}

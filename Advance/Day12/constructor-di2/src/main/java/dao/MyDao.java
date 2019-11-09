package dao;

import temp.MyTemplate;

public class MyDao {

	private MyTemplate myTemplate;

	public MyDao() {
		super();
	}
	
	

	public MyDao(MyTemplate myTemplate) {
		System.out.println("param called");
		this.myTemplate = myTemplate;
	}



	public MyTemplate getMyTemplate() {
		return myTemplate;
	}

	public void setMyTemplate(MyTemplate myTemplate) {
		this.myTemplate = myTemplate;
	}
	
	public void add() {
		System.out.println("add record");
		myTemplate.insert();
	}
	
}
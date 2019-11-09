package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import temp.MyTemplate;

//@Component
@Repository
public class MyDao {

	@Autowired
	private MyTemplate myTemplate;

	public MyDao() {
		System.out.println("MyDao() cons called");
	}
	
	

	public MyDao(MyTemplate myTemplate) {
		System.out.println("param called");
		this.myTemplate = myTemplate;
	}



	public MyTemplate getMyTemplate() {
		return myTemplate;
	}

	public void setMyTemplate(MyTemplate myTemplate) {
		System.out.println("setMyTemplate()======");
		this.myTemplate = myTemplate;
	}
	
	public void add() {
		System.out.println("add record");
		myTemplate.insert();
	}
	
}

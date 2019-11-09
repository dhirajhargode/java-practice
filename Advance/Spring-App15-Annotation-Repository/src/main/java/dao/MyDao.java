package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dto.MyTemplate;

@Repository
public class MyDao {

	@Autowired
	private MyTemplate template;

	public MyDao() {
		System.out.println("MyDao : 0 arg constructor");
	}

	public MyDao(MyTemplate template) {
		System.out.println("MyDao : param arg constructor");
		this.template = template;
	}

	public MyTemplate getTemplate() {
		return template;
	}

	public void setTemplate(MyTemplate template) {
		System.out.println("setTemplate() invoke");
		this.template = template;
	}

	public void add() {
		System.out.println("inside add()");
		template.insert();

	}

}

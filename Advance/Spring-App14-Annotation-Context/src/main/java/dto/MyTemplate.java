package dto;

import org.springframework.stereotype.Component;

@Component
public class MyTemplate {

	public void insert() {
		System.out.println("inside insert()");
	}
}

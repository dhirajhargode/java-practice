package dto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MyTemplate {

	public void insert() {
		System.out.println("inside insert()");
	}
}

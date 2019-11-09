package dto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MyTemplate {

	public void insert() {
		System.out.println("inside insert()");
	}
}

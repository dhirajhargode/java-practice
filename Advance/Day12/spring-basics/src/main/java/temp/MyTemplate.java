package temp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class MyTemplate {
	
	public MyTemplate() {
		System.out.println("constructor MyTemp");
	}
	
	public void insert() {
		System.out.println("insert record");
	}

}

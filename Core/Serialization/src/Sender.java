

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sender.Account;

public class Sender {

	public static void main(String[] args) throws IOException {
		
		Account account = new Account(20,"Suh");
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account);		
		System.out.println("Done");
	}
}

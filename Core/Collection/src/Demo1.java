import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		String s = "D:\\CDAC\\Dhiraj\\java\\exam\\Collection\\src\\com\\collection\\properties\\db.properties";
		FileInputStream fis = new FileInputStream(s);
		p.load(fis);
		System.out.println(p);

	}

}

package com.collection.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class MyPropertiesDemo {

	public static void main(String[] args) {
		String s = "D:\\CDAC\\Dhiraj\\java\\exam\\Collection\\src\\com\\collection\\properties\\db.properties";

		Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream(s);
			p.load(fis);
			System.out.println(p);
			System.out.println(p.getProperty("scott"));
			p.setProperty("go", "to Hell");
			System.out.println(p);
			FileOutputStream fos = new FileOutputStream(s);
			p.store(fos, "upadated by Dhiraj");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Integer i = new Integer(10);

	}

}

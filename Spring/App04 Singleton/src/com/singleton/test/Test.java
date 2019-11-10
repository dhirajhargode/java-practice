package com.singleton.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.singleton.pattern.DateFormatter;

public class Test {

	public static void main(String[] args) throws Exception {

		DateFormatter df1 = DateFormatter.getInstance();
		int obj1 = df1.hashCode();
		System.out.println("DF1 "+obj1);

		// directly calling getInstance

		DateFormatter df2 = DateFormatter.getInstance();
		int obj2 = df2.hashCode();
		System.out.println("DF2 "+obj1);
		
		System.out.println("calling Instance "+(obj1 == obj2));

		// cloning
		DateFormatter df3 =(DateFormatter)df1.clone();
		int obj3 = df3.hashCode();
		System.out.println("Clone object "+obj3);
		//	System.out.println(df3);

		System.out.println("cloning "+(obj1 == obj3));

		// serialization
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		DateFormatter df4 = DateFormatter.getInstance();
		oos.writeObject(df4);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DateFormatter df5 = (DateFormatter) ois.readObject();

		int obj4 = df5.hashCode();
		System.out.println("Serializable object "+obj4);
		System.out.println(df5);
		System.out.println("Deserialization "+(obj1 == obj4));

	}
}

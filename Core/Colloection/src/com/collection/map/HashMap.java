package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapDemo {
	public static void main(String[] args) {

		HashMap m = new HashMap();
		m.put("A", 1000);
		m.put("B", 500);
		m.put("C", 200);
		m.put("D", 700);
		System.out.println(m);
		System.out.println(m.put("A", 100));
/*
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);

		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "........." + m1.getValue());
			if (m1.getKey().equals("C")) {
				m1.setValue(2000);
			}
			System.out.println(m);

		}

	
*/}

}
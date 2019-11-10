package com.collection.map;

import java.util.IdentityHashMap;

 class IdentityHashMapDemo {
	public static void main(String[] args) {
		
		IdentityHashMap m =new IdentityHashMap();
		//HashMap m=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		 m.put(i1,"pavan");
		 m.put(i2,"kalyan");
		 System.out.println(m);
	}

}


package com.ArrayListDemo;
import com.collection.Employee;

import java.util.TreeSet;
import java.util.Iterator;
 class TSetDemo{
 	
	public static void main(String[] args){
		
		TreeSet<Integer> mainset = new TreeSet<>();
		TreeSet<Integer> headset = (TreeSet<Integer>)mainset.headSet(20);
		TreeSet<Integer> tailset = (TreeSet<Integer>)mainset.tailSet(50);
		TreeSet<Integer> subset = (TreeSet<Integer>)mainset.subSet(20,50);
		
		mainset.add(10);
		mainset.add(20);
		mainset.add(30);
		mainset.add(40);
		headset.add(11);
		headset.add(15);
		tailset.add(62);
		tailset.add(66);
		subset.add(45);
		subset.add(35);
	
		System.out.println("mainset "+mainset);
		System.out.println("headset "+headset);
		System.out.println("tailset "+tailset);
		System.out.println("subset "+subset);
		System.out.println("main first " +mainset.first());
		System.out.println("main last "+mainset.last());
		System.out.println("subset first "+subset.first());
		System.out.println("subset last "+subset.last());
	
	
	/*
		Iterator itr1 = mainset.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		Iterator itr2 = childset.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	*/
	}
 }
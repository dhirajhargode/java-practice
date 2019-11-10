package com.mc.ba.beans;

import java.util.HashMap;
import java.util.Map;

public class Monitor {

	private static Map<String, Integer> map = new HashMap();

	public static void increment(String methodName) {
		if (map.containsKey(methodName)) {
			Integer cnt = map.get(methodName);
			cnt++;
			map.put(methodName, cnt);
		} else {
			map.put(methodName, 1);
		}
	}
	public static int getAccessCount(String methodName) {
		return map.get(methodName);
	}

}

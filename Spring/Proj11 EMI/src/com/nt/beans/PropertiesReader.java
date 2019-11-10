package com.nt.beans;

import java.util.HashMap;
import java.util.Map;

public class PropertiesReader {
	private String ibm;
	private String oracle;
	private String ms;

	private Map<String, Integer> map = new HashMap<>();

	public void setIbm(String ibm) {
		this.ibm = ibm;
	}

	public void setOracle(String oracle) {
		this.oracle = oracle;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}

	public Map setData() {

		map.put("oracle", Integer.parseInt(oracle));
		map.put("ibm", Integer.parseInt(ibm));
		map.put("ms", Integer.parseInt(ms));
		return map;
	}

}

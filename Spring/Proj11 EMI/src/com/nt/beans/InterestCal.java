package com.nt.beans;

import java.util.Map;

public class InterestCal {
	private PropertiesReader pop;

	public void setPop(PropertiesReader pop) {
		this.pop = pop;
	}

	public String cal(String com, float rs, int month) {

		Map<String, Integer> map = pop.setData();
		int emi = map.get(com);
		int interest = (int) (emi * rs / month);

		return "interest is rs =" + interest;

	}
}

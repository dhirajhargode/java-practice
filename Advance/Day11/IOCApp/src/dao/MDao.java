package dao;

import temp.MTemplate;


public class MDao {
	private MTemplate mtemp;
	
	public void setMtemp(MTemplate mtemp) {
		this.mtemp = mtemp;
	}

	public void add() {
		System.out.println("add record");
		mtemp.insert();
	}
}

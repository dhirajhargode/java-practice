package com.anno.beans;

import org.springframework.stereotype.Component;

@Component("eng")
public class Engine {
	private int eid;
	private String ename;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", ename=" + ename + "]";
	}

}

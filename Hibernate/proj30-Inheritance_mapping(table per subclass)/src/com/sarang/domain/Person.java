package com.sarang.domain;

public abstract class Person {
	private int pid;
	private String name;
	private String compony;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompony() {
		return compony;
	}

	public void setCompony(String compony) {
		this.compony = compony;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", compony=" + compony + "]";
	}

}

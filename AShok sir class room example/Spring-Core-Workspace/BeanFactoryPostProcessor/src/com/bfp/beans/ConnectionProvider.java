package com.bfp.beans;

public class ConnectionProvider {

	private String url;
	private String uname;
	private String pwd;
	private String driverCls;

	public ConnectionProvider(String url, String uname, String pwd, String driverCls) {
		this.url = url;
		this.uname = uname;
		this.pwd = pwd;
		this.driverCls = driverCls;
	}

	@Override
	public String toString() {
		return "ConnectionProvider [url=" + url + ", uname=" + uname + ", pwd=" + pwd + ", driverCls=" + driverCls
				+ "]";
	}
	
	

}

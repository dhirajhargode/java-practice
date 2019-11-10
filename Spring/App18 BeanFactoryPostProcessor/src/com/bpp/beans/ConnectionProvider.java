package com.bpp.beans;

public class ConnectionProvider {

	private String url, uname, psw, driver;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	

	/*public ConnectionProvider(String url, String uname, String psw, String driver) {
		this.url = url;
		this.uname = uname;
		this.psw = psw;
		this.driver = driver;
	}*/

	@Override
	public String toString() {
		return "ConnectionProvider [url=" + url + ", uname=" + uname + ", psw=" + psw + ", driver=" + driver + "]";
	}

}

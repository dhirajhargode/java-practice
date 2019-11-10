package com.fm.beans;

public class ServiceProvider {
	
	public SecurityService getInstance() {
		String algo="AES";
		byte[] secretkey =new byte[] {'T','h','e','b','e','s','t','s','e','c','r','e','t','k','e','y'};
		
		return new SecurityService(algo, secretkey);
	}

}

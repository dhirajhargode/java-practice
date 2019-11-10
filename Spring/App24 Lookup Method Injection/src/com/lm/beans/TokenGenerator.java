package com.lm.beans;

public abstract class TokenGenerator {
	
	private Token token;
	
	
	public TokenGenerator() {
		System.out.println("Token Generator : 0 param");
	}

	public abstract Token getToken();

	/*public void processRequest() {
		token=getToken();
		System.out.println(token.hashCode());
	}*/
	

}

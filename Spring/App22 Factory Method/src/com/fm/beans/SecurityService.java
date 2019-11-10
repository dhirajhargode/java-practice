package com.fm.beans;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class SecurityService {

	private String algo;
	private byte[] secretkey;

	

	public SecurityService(String algo, byte[] secretkey) {
		super();
		this.algo = algo;
		this.secretkey = secretkey;
	}

	public String encrypt(String value) throws Exception {
		Key key = generatekey();
		Cipher cipher = Cipher.getInstance(algo); // throws exception
		cipher.init(cipher.ENCRYPT_MODE, key);
		byte[] arr = cipher.doFinal(value.getBytes());
		return Base64.getEncoder().encodeToString(arr);
	}

	public String decrypt(String encVal) throws Exception {
		Key key = generatekey();
		Cipher cipher = Cipher.getInstance(algo);
		cipher.init(cipher.DECRYPT_MODE, key);
		byte[] decarr = Base64.getDecoder().decode(encVal);
		byte[] decval = cipher.doFinal(decarr);
		return new String(decval);
	}

	public Key generatekey() {
		return new SecretKeySpec(secretkey, algo);
	}

}

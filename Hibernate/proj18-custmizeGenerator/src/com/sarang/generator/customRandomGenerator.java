package com.sarang.generator;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class customRandomGenerator implements IdentifierGenerator {
	public customRandomGenerator() {
		System.out.println("constructor of generator class is executing");
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor arg0, Object arg1) throws HibernateException {
		int id = 0;
		Random rad = null;
		rad = new Random();
		id = rad.nextInt(1000);
		return id;
	}

}

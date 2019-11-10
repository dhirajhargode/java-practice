package com.awi.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class OrderManage implements ApplicationContextAware {

	private int zipcode;
	private BlueDartImpl bluedart;
	private DTDCImpl dtdc;

	private ApplicationContext ctx;
	private IDeliveryService dservice;

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public void setBluedart(BlueDartImpl bluedart) {
		this.bluedart = bluedart;
	}

	public void setDtdc(DTDCImpl dtdc) {
		this.dtdc = dtdc;
	}

	public void deliveryProduct(int zipcode) {

		if (zipcode > 5000) {
			// bluedraft.delivey(zipcode);
			dservice = ctx.getBean("bluedart", BlueDartImpl.class);
		} else {
			// dtdc.delivey(zipcode);
			dservice = ctx.getBean("dtdc", DTDCImpl.class);
		}
		dservice.delivey(zipcode);

	}

	// This method is use to inject Context object
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;

	}

}

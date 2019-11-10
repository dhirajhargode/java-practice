package com.awi.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class OrderManager implements ApplicationContextAware {

	private ApplicationContext ctx;
	private IDeliverService dservice;

	/**
	 * This method used to inject Context object
	 */
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}

	public void deliverProduct(int zipCode) {
		// pulling Dependent object
		if (zipCode > 5000) {
			dservice = ctx.getBean("bluedart", BlueDartDeliveryImpl.class);
		} else {
			dservice = ctx.getBean("dtdc", DTDCDeliveryImpl.class);
		}
		dservice.deliver(zipCode);
	}

}

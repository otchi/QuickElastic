package com.edifixio.amine.config.beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Config<ContentType> extends ArrayList<ContentType>{
	
	protected Class<?> beanClass;

	
	public Class<?> getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class<?> beanClass) {
		this.beanClass = beanClass;
	}

}

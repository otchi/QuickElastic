package com.edifixio.amine.config.response;

public class Mapping {

	private String nameInBean;
	private String nameInIndex;
	
	public Mapping(String nameInBean, String nameInIndex) {
		super();
		this.nameInBean = nameInBean;
		this.nameInIndex = nameInIndex;
	}

	public String getNameInBean() {
		return nameInBean;
	}

	public void setNameInBean(String nameInBean) {
		this.nameInBean = nameInBean;
	}

	public String getNameInIndex() {
		return nameInIndex;
	}

	

	public void setNameInIndex(String nameInIndex) {
		this.nameInIndex = nameInIndex;
	}
}
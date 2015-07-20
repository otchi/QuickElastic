package com.edifixio.amine.config.faceting;

public abstract class OneFacetingConf {
	protected String nameInMap;
	protected String nameInIndex;
	
	

	public OneFacetingConf(String nameInMap, String nameInIndex) {
		super();
		this.nameInMap = nameInMap;
		this.nameInIndex = nameInIndex;
	}

	public String getNameInBean() {
		return nameInMap;
	}

	public void setNameInBean(String nameInBean) {
		this.nameInMap = nameInBean;
	}

	public String getNameInIndex() {
		return nameInIndex;
	}

	public void setNameInIndex(String nameInIndex) {
		this.nameInIndex = nameInIndex;
	}
	
}

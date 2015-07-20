package com.edifixio.amine.config.faceting;

public class SimpleFacetingConf extends OneFacetingConf{
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nameInMap+"--"+this.nameInIndex+"--\n"+super.toString();
	}

	public SimpleFacetingConf(String nameInMap, String nameInIndex) {
		super(nameInMap, nameInIndex);
		// TODO Auto-generated constructor stub
	}

}

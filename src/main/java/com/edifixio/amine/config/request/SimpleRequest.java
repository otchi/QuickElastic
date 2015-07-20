package com.edifixio.amine.config.request;

public class SimpleRequest implements Request{
	
	private String nameOfField;
	private String kindOfSearch;
	private String operator;
	
	
	public SimpleRequest(String nameOfField, String kindOfSearch, String operator) {
		super();
		this.nameOfField = nameOfField;
		this.kindOfSearch = kindOfSearch;
		this.operator = operator;
	}
	public String getNameOfField() {
		return nameOfField;
	}
	public void setNameOfField(String nameOfField) {
		this.nameOfField = nameOfField;
	}
	public String getKindOfSearch() {
		return kindOfSearch;
	}
	public void setKindOfSearch(String kindOfSearch) {
		this.kindOfSearch = kindOfSearch;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}


}

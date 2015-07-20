package com.edifixio.amine.testBean;

public class MyResponse  {
	private String company;
	private String pdg;
	private String country;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getPdg() {
		return pdg;
	}
	public void setPdg(String pdg) {
		this.pdg = pdg;
		System.out.println("th nek");
	}
	public String getCountry() {
		return country;
	}
	public void setContry(String country) {
		this.country = country;
	}


	
}

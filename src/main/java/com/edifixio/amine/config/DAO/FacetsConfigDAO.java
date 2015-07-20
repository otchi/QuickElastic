package com.edifixio.amine.config.DAO;

import java.io.IOException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.edifixio.amine.config.beans.FacetingConfig;
import com.edifixio.amine.config.faceting.SimpleFacetingConf;

public class FacetsConfigDAO extends ConfigDAO<FacetingConfig> {

	public FacetsConfigDAO() throws SAXException, IOException {
		super();
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public FacetingConfig load() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		FacetingConfig facetingConfig=new FacetingConfig();
		Element facets = (Element) (this.element.getElementsByTagName("facets").item(0));
		facetingConfig.setBeanClass(Class.forName(facets.getAttribute("class")));
		NodeList listeOfFaceting= facets.getElementsByTagName("faceting");
		
		for (int i = 0; i < listeOfFaceting.getLength(); i++) {
			Element facet = (Element) listeOfFaceting.item(i);
			facetingConfig.add(
					new SimpleFacetingConf(
								facet.getAttribute("nameInMap"),
								facet.getAttribute("nameInIndex")
								)
					);
			
		}
		return facetingConfig;
	}
	
	public static void main(String args[]) throws SAXException, IOException, ClassNotFoundException{
		System.out.println(new FacetsConfigDAO().load());
	}


}

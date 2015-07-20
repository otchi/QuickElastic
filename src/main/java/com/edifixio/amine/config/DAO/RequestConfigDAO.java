package com.edifixio.amine.config.DAO;

import java.io.IOException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.edifixio.amine.config.beans.RequestConfig;
import com.edifixio.amine.config.request.Search;
import com.edifixio.amine.config.request.SimpleRequest;

public class RequestConfigDAO extends ConfigDAO<RequestConfig>{

	public RequestConfigDAO() throws SAXException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public RequestConfig load() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		RequestConfig result = new RequestConfig();
		Element request = (Element) (this.element.getElementsByTagName("request").item(0));
		result.setBeanClass(Class.forName(request.getAttribute("class")));
		NodeList listeOfSearch=request.getElementsByTagName("search");
		
		for (int i = 0; i < listeOfSearch.getLength(); i++) {
			Element searchNode=(Element) listeOfSearch.item(i);
			NodeList listeOfNode=searchNode.getElementsByTagName("query");
			Search search=new Search(searchNode.getAttribute("nameInBean"));
			for(int j = 0; j < listeOfNode.getLength(); j++){
				
				Element query = (Element) listeOfSearch.item(i);
				 search.add(new SimpleRequest(
											query.getAttribute("nameOfField"), 
											query.getAttribute("kindOfSearch"),
											query.getAttribute("operator")
											));
			}
		result.add(search);
		}
		
		
		return result;
	}


public static void main(String ars[]) throws ClassNotFoundException, SAXException, IOException{
		System.out.println(new RequestConfigDAO().load().get(0).getNameInBean());	
}
}
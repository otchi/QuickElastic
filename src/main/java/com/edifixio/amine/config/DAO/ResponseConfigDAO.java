package com.edifixio.amine.config.DAO;

import java.io.IOException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.edifixio.amine.config.beans.ResponseConfig;
import com.edifixio.amine.config.response.Mapping;

public class ResponseConfigDAO extends ConfigDAO<ResponseConfig> {

	public ResponseConfigDAO() throws SAXException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResponseConfig load() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		ResponseConfig result = new ResponseConfig();
		Element response = (Element) (this.element.getElementsByTagName("responce").item(0));
		result.setBeanClass(Class.forName(response.getAttribute("class")));
		NodeList indexes = response.getElementsByTagName("mapping");
		
		for (int i = 0; i < indexes.getLength(); i++) {
			Element index = (Element) indexes.item(i);
			result.add(new Mapping(index.getAttribute("nameInBean"),
						index.getAttribute("nameInIndex")));
		}
		
		System.out.println(result);

		return result;

	}
	
	public static void main(String ars[]) throws ClassNotFoundException, SAXException, IOException{
		System.out.println(new ResponseConfigDAO().load().get(0).getNameInIndex());	
	}

}

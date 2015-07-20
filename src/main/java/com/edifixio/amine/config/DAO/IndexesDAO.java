package com.edifixio.amine.config.DAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class IndexesDAO extends ConfigDAO<HashMap<String, List<String>>> {

	public IndexesDAO() throws SAXException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public HashMap<String, List<String>> load() {
		// TODO Auto-generated method stub
		HashMap<String, List<String>> result = new HashMap<String, List<String>>();
		Element indexes = (Element) (this.element.getElementsByTagName("indexes").item(0));
		NodeList listeOfIndex = indexes.getElementsByTagName("index");
		
		for (int i = 0; i < listeOfIndex.getLength(); i++) {
			Element index = (Element) listeOfIndex.item(i);
			NodeList types = index.getElementsByTagName("type");
			ArrayList<String> listOfType = new ArrayList<String>();

			for (int j = 0; j < types.getLength(); j++) {
				listOfType.add(((Element) types.item(j)).getAttribute("name"));
			}

			result.put(index.getAttribute("name"), listOfType);
		}
		System.out.println(result);

		return result;
	}

	public static void main(String args[]) throws SAXException, IOException {
		new IndexesDAO().load();
	}

}

package com.edifixio.amine.config.DAO;

import java.io.IOException;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;


public abstract class ConfigDAO<Type> {
	 protected Element element;
	 
	 public ConfigDAO() throws SAXException, IOException{
		 DOMParser parser = new DOMParser();
		 parser.parse("/home/amine/workspace/" 
				 		+ "QuickElastic/src/ressource/" 
				 		+ "xmlSourceTest/MyConfig.xml");
		 this.element = parser.getDocument().getDocumentElement();
		
	 }
	 
	 public abstract Type load() throws ClassNotFoundException;
	 
	 public String getHost(){
		return element.getAttribute("host");
		 
	 }

}

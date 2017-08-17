package com.ftl.helper;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class MapFile {
	private InputStream inputFile;
	
	public MapFile(String mapPath, String mapFile) throws MalformedURLException, IOException {
		if (mapPath.endsWith("/") == false) {
			mapPath = mapPath + "/";
		}
		inputFile = new URL(mapPath + mapFile).openStream();

	}
	
	public List<String> getMapList() throws ParserConfigurationException, SAXException, IOException {
		String aliasPairs = "";
		List<String> returnList = new ArrayList<String>();
		
		DocumentBuilderFactory dbFactory = 
	            DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);

		NodeList nlist = doc.getElementsByTagName("alias");
		NodeList child = nlist.item(0).getChildNodes();
		for (int i=0; i < child.getLength(); i++) {
			if (child.item(i).getNodeType() == Node.ELEMENT_NODE && child.item(i).getNodeName().compareTo("map") == 0) {
				Element element = (Element) child.item(i);
				aliasPairs = element.getAttribute("name") + ";" + element.getAttribute("value");

				returnList.add(aliasPairs);
			}
		}
		
		return returnList;
	}
	

}

package com.itcast.utils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

/*
 * JAPTDOM解析的工具类
 * 
*/
public class JaxpDomUtil {
	public static Document getDocument(String path) throws Exception {
		//解析工厂类
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//获取解析器对象
		DocumentBuilder builder=factory.newDocumentBuilder();
		//解析xml
		
		return builder.parse(path);
	}
	/**
	 * 回写方法
	 * @param document
	 * @param path
	 * @throws Exception
	 */
	public static void writeXML(Document document,String path) throws Exception {
		//获取回写类的工厂
		TransformerFactory factory=TransformerFactory.newInstance();
		//获取回写类
		Transformer transformer=factory.newTransformer();
		//回写
		transformer.transform(new DOMSource(document),new StreamResult(path));
		
	}

	
	
}

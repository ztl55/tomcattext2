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
 * JAPTDOM�����Ĺ�����
 * 
*/
public class JaxpDomUtil {
	public static Document getDocument(String path) throws Exception {
		//����������
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//��ȡ����������
		DocumentBuilder builder=factory.newDocumentBuilder();
		//����xml
		
		return builder.parse(path);
	}
	/**
	 * ��д����
	 * @param document
	 * @param path
	 * @throws Exception
	 */
	public static void writeXML(Document document,String path) throws Exception {
		//��ȡ��д��Ĺ���
		TransformerFactory factory=TransformerFactory.newInstance();
		//��ȡ��д��
		Transformer transformer=factory.newTransformer();
		//��д
		transformer.transform(new DOMSource(document),new StreamResult(path));
		
	}

	
	
}

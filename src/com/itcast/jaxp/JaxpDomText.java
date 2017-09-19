package com.itcast.jaxp;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import com.sun.xml.internal.txw2.Document;

/*
 * 	jaxp的dom解析xml
 * 
*/
public class JaxpDomText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void run1() throws ParserConfigurationException {
		//获取解析器工厂类
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//获取解析器对象
		DocumentBuilder builder=factory.newDocumentBuilder();
		//解析xml的文档，返回document对象
	
		//获取作者对象的集合，返回NodeList
		
		//循环遍历，拿到每一个作者，打印文本的内容，getTextContent()
	}

}

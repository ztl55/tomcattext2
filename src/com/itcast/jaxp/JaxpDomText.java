package com.itcast.jaxp;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import com.sun.xml.internal.txw2.Document;

/*
 * 	jaxp��dom����xml
 * 
*/
public class JaxpDomText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void run1() throws ParserConfigurationException {
		//��ȡ������������
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//��ȡ����������
		DocumentBuilder builder=factory.newDocumentBuilder();
		//����xml���ĵ�������document����
	
		//��ȡ���߶���ļ��ϣ�����NodeList
		
		//ѭ���������õ�ÿһ�����ߣ���ӡ�ı������ݣ�getTextContent()
	}

}

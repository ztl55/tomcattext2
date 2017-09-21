package com.itcast.jaxp;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.sun.org.apache.bcel.internal.classfile.Attribute;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Attributes;



public class JaxpSaxText {
	
	public static void main(String[] args) {
		
	}
	public static void run1() throws Exception{
		//��ȡSAX�Ľ�������
		SAXParserFactory factory=SAXParserFactory.newInstance();
		//��ȡ������
		SAXParser parser=factory.newSAXParser();
		//����
		parser.parse("WebContent/xml/book2.xml", new MyHandler());
		
	}

}
/**
 * �Լ��¼�������
 * ��д������
 * @author pc
 *
 */
class MyHandler extends DefaultHandler{
	/**
	 * ֻҪһ��������ʼ��ǩ��ʱ��Ĭ�ϵ��ø÷������ѽ��������ݸ�ֵ������
	 */
	
	public void startElement(String uri, String localName, String qName, 
			Attributes attributes)throws SAXException{
		System.out.println("��ʼ��ǩ"+qName);
		
	}
	/**
	 * ֻҪ�������ı������ݣ�Ĭ�ϴ��ø÷���
	 */
	public void characters(char[] ch, int start, int lenght)
			throws SAXException{
		String str=new String(ch, start, lenght);
		System.out.println(str);
		
	}
	/**
	 * ������������ǩ��ʱ��Ĭ�ϵ��÷������ѽ��������ݸ�ֵ������
	 */
	public void endElement(String uri, String localName, String qName)
			throws SAXException{
		System.out.println("������ǩ"+qName);
		
	}
	
	
}

package com.itcast.jaxp;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;







public class JaxpSaxText {
	
	public static void main(String[] args) {
		
		try {
			run1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void run1() throws Exception{
		//��ȡSAX�Ľ�������
		SAXParserFactory factory=SAXParserFactory.newInstance();
		//��ȡ������
		SAXParser parser=factory.newSAXParser();
		//����
		parser.parse("WebContent/xml/book2.xml", new MyHandler2());
		
	}

}
class MyHandler2 extends DefaultHandler{
	//������������߱�ǩ��ʱ��flag���ó�true
	private boolean flag=false;
	private int count=0;
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//���߱�ǩflag���ó�true
		if ("����".equals(qName)) {
			flag=true;
			count++;
		}
		
	}
	/**
	 * ����characters�������ֻ�ڽ������߱�ǩ��ʱ�򣬲Ŵ�ӡ
	 */

	public void characters(char[] ch, int start, int length) throws SAXException {
		
		//ÿһ�δ�ӡ
		if (flag && count==2) {
			
		
		String str=new String(ch,start, length);
		System.out.println(str);
		}
	}
	
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		//flag�ָ���false
		flag=false;
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
		System.out.println("��ʼ��ǩ:"+qName);
		
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
	**/
	public void endElement(String uri, String localName, String qName)
			throws SAXException{
		System.out.println("������ǩ:"+qName);
		
	}
	
	
}

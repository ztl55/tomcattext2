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
		//获取SAX的解析工厂
		SAXParserFactory factory=SAXParserFactory.newInstance();
		//获取解析器
		SAXParser parser=factory.newSAXParser();
		//解析
		parser.parse("WebContent/xml/book2.xml", new MyHandler());
		
	}

}
/**
 * 自己事件处理器
 * 重写三方法
 * @author pc
 *
 */
class MyHandler extends DefaultHandler{
	/**
	 * 只要一解析到开始标签的时候，默认调用该方法，把解析的内容赋值给参数
	 */
	
	public void startElement(String uri, String localName, String qName, 
			Attributes attributes)throws SAXException{
		System.out.println("开始标签"+qName);
		
	}
	/**
	 * 只要解析到文本的内容，默认代用该方法
	 */
	public void characters(char[] ch, int start, int lenght)
			throws SAXException{
		String str=new String(ch, start, lenght);
		System.out.println(str);
		
	}
	/**
	 * 解析到结束标签的时候，默认调用方法，把解析的内容赋值给参数
	 */
	public void endElement(String uri, String localName, String qName)
			throws SAXException{
		System.out.println("结束标签"+qName);
		
	}
	
	
}

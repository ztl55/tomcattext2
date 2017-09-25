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
		//获取SAX的解析工厂
		SAXParserFactory factory=SAXParserFactory.newInstance();
		//获取解析器
		SAXParser parser=factory.newSAXParser();
		//解析
		parser.parse("WebContent/xml/book2.xml", new MyHandler2());
		
	}

}
class MyHandler2 extends DefaultHandler{
	//如果解析到作者标签的时候，flag设置成true
	private boolean flag=false;
	private int count=0;
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//作者标签flag设置成true
		if ("作者".equals(qName)) {
			flag=true;
			count++;
		}
		
	}
	/**
	 * 控制characters的输出，只在解析作者标签的时候，才打印
	 */

	public void characters(char[] ch, int start, int length) throws SAXException {
		
		//每一次打印
		if (flag && count==2) {
			
		
		String str=new String(ch,start, length);
		System.out.println(str);
		}
	}
	
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		//flag恢复成false
		flag=false;
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
		System.out.println("开始标签:"+qName);
		
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
	**/
	public void endElement(String uri, String localName, String qName)
			throws SAXException{
		System.out.println("结束标签:"+qName);
		
	}
	
	
}

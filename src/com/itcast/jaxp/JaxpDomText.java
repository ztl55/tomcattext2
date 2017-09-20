package com.itcast.jaxp;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.itcast.utils.JaxpDomUtil;
import com.sun.org.apache.bcel.internal.classfile.Node;
import com.sun.xml.internal.txw2.Document;

/*
 * 	jaxp的dom解析xml
 * 
*/
public class JaxpDomText {

	public static void main(String[] args) {
		try {
			run5();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void run1() throws Exception {
		//获取解析器工厂类
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//获取解析器对象
		DocumentBuilder builder=factory.newDocumentBuilder();
		//解析xml的文档，返回document对象
		org.w3c.dom.Document document=builder.parse("WebContent/xml/book2.xml");
		//获取作者对象的集合，返回NodeList
		NodeList nodeList=document.getElementsByTagName("作者");
		//循环遍历，拿到每一个作者，打印文本的内容，getTextContent()
		for (int i = 0; i < nodeList.getLength(); i++) {
			
			org.w3c.dom.Node node=nodeList.item(i);
			System.out.println(node.getTextContent());
		}
	}
	public static void run2() throws Exception {
		//获取工厂类
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//获取解析器
		DocumentBuilder builder=factory.newDocumentBuilder();
		//解析xml，返回document对象
		org.w3c.dom.Document document=builder.parse("WebContent/xml/book2.xml");
		//获取第二本书
		org.w3c.dom.Node book2=document.getElementsByTagName("书").item(1);
		//创建元素对象
		org.w3c.dom.Element cat=document.createElement("猫");
		//设置文本内容
		cat.setTextContent("你是一只猫");
		//把元素对象添加到第二本书下
		book2.appendChild(cat);
		//会写
		//创建回写类的工厂
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		//获取回写类
		Transformer transformer=transformerFactory.newTransformer();
		//调用回写的方法
		transformer.transform(new DOMSource(document), new StreamResult("WebContent/xml/book2.xml"));
	
	}
	public static void run3() throws Exception {
		String path="WebContent/xml/book2.xml";
		//获取文档对象
		org.w3c.dom.Document document=JaxpDomUtil.getDocument(path);
		//获取猫
		org.w3c.dom.Node cat=document.getElementsByTagName("猫").item(0);
		//获取书（猫的父节点）
		org.w3c.dom.Node book2=cat.getParentNode();
		//通过书删除猫
		book2.removeChild(cat);
		//回写
		JaxpDomUtil.writeXML(document, path);
	}
	public static void run4() throws Exception {
		String path="WebContent/xml/book2.xml";
		//获取文档对象
		org.w3c.dom.Document document=JaxpDomUtil.getDocument(path);
		//获取书的标签
		org.w3c.dom.Element cat=(Element) document.getElementsByTagName("书").item(0);
		//修改书标签中的属性
		cat.setAttribute("编号", "b6");
		//回写
		JaxpDomUtil.writeXML(document, path);
	}
	public static void run5() throws Exception {
		String path="WebContent/xml/book2.xml";
		//获取文档对象
		org.w3c.dom.Document document=JaxpDomUtil.getDocument(path);
		//获取作者的元素
		Element zzuozhe=(Element) document.getElementsByTagName("作者").item(0);
		//替换元素下的文本
		zzuozhe.setTextContent("我们是兄弟");
		//回写
		JaxpDomUtil.writeXML(document, path);	
	}
}

package com.itcast.dom4j;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference.Elements;



public class Dom4jTest {
	
	public static void main(String[] args) {
		try {
			run5();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 删除子节点
	 */
	public static void run4() throws Exception{
		//获取解析器对象
		SAXReader reader=new SAXReader();
		//解析XML，返回Document对象
		Document document=reader.read("WebContent/xml/book2.xml");
		//获取根节点
		Element root=document.getRootElement();	
		//获取猫
		Element book2=(Element) root.elements("书").get(1);
		Element cat=book2.element("毛");
		//通过猫获取父节点
		//cat。getParent();
		//通过父节点删除猫
		book2.remove(cat);
		//回写
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter writer=new XMLWriter(new FileOutputStream("WebContent/xml/book2.xml"),format);
		writer.write(document);
		writer.close();
		
	}
	/**
	 * 修改子节点内容
	 * @throws Exception 
	 */
	public static void run5() throws Exception {
		//获取解析器
		SAXReader reader=new SAXReader();
		//解析XML,返回Document对象
		Document document=reader.read("WebContent/xml/book2.xml");
		//获取根节点
		Element root=document.getRootElement();
		//获取标签的节点
		Element book2=(Element) root.elements("书").get(1);
		Element dog=book2.element("新的");
		dog.setText("小猫");
		//回写
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter writer=new XMLWriter(new FileOutputStream("WebContent/xml/book2.xml"),format);
		writer.write(document);
		writer.close();
	}

	
	
	/**
	 * 在第二本书的作者标签之前添加新标签
	 */
	public static void run3() throws Exception{
		//List
		//获取解析器对象
		SAXReader reader=new SAXReader();
		//解析XML，返回Document对象
		Document document=reader.read("WebContent/xml/book2.xml");
		//获取根节点
		Element root=document.getRootElement();
		//获取第二本书
		Element book2=(Element) root.elements("书").get(1);
		//获取书下所有子节点,返回List集合
		List<Element> list=book2.elements();
		//创建元素对象 DocumentHelper.createElement("新的")
		Element dog=DocumentHelper.createElement("新的");
		dog.setText("这是一个新的标签");
		//list.add(index,Element)
		list.add(4,dog);
		//回写
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter writer=new XMLWriter(new FileOutputStream("WebContent/xml/book2.xml"),format);
		writer.write(document);
		writer.close();
		
	}

	

	/**
	 * 添加子节点
	 */
	public static void run2() throws Exception{
		//获取解析对象
		SAXReader reader=new SAXReader();
		//解析XML，返回Document对象
		Document document=reader.read("WebContent/xml/book2.xml");
		//获取根节点
		Element root=document.getRootElement();
		//获取第二本书
		Element book2=(Element) root.elements("书").get(1);
		//可以直接在前二本书下添加子节点，设置文本内容
		book2.addElement("毛").setText("我是毛");
		//回写
		//创建漂亮格式
		OutputFormat format=OutputFormat.createPrettyPrint();
		//设置编码
		format.setEncoding("utf-8");
		
		//回写类
		XMLWriter writer=new XMLWriter(new FileOutputStream("WebContent/xml/book2.xml"),format);
		//回写了文档对象
		writer.write(document);
		//关闭流
		writer.close();
		
	}

	
	
	/**
	 * 获取作者的内容
	 * 
	 */
	public static void run1() throws Exception{
		//获取解析器对象
		SAXReader reader=new SAXReader();
		//解析XML，返回Document对象
		Document document=reader.read("WebContent/xml/book2.xml");
		//获取根节点（书架标签）
		Element root=document.getRootElement();
		//获取书的节点，获取第二本书
		List<Element> books=root.elements("书");
		Element book2=books.get(0);
		//获取作者的标签
		Element author2=book2.element("作者");
		//获取文本内容
		System.out.println(author2.getText());
		
	}

}

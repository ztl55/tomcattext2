package com.itcast.test;

import java.lang.reflect.Method;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import com.itcast.servlet.HelloServlet;
import com.sun.xml.internal.txw2.Document;

/**
 * 使用DOM4J解析myveb.xml,通过run方法执行
 * @author Administrator
 *
 */
public class Demo {
	@Test
	public void name() throws Exception {
		//解析myweb.xml
		//获取解析器
		SAXReader reader=new SAXReader();
		//解析
		org.dom4j.Document document=reader.read("src/myveb.xml");
		//获取根节点
		Element root=document.getRootElement();
		//获取servlet节点
		Element servlet=root.element("servlet");
		
		Element servletclass=servlet.element("servlet-class");
		//获取包名+类名的全路径
		String path=servletclass.getText();
		//获取Class对象
		Class clazz=Class.forName(path);
		//获取实例
		HelloServlet hello=(HelloServlet) clazz.newInstance();
		//获取方法
		Method m=clazz.getDeclaredMethod("run");
		m.setAccessible(true);
		m.invoke(hello);
	}

}

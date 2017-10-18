package com.itcast.test;

import java.lang.reflect.Method;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import com.itcast.servlet.HelloServlet;
import com.sun.xml.internal.txw2.Document;

/**
 * ʹ��DOM4J����myveb.xml,ͨ��run����ִ��
 * @author Administrator
 *
 */
public class Demo {
	@Test
	public void name() throws Exception {
		//����myweb.xml
		//��ȡ������
		SAXReader reader=new SAXReader();
		//����
		org.dom4j.Document document=reader.read("src/myveb.xml");
		//��ȡ���ڵ�
		Element root=document.getRootElement();
		//��ȡservlet�ڵ�
		Element servlet=root.element("servlet");
		
		Element servletclass=servlet.element("servlet-class");
		//��ȡ����+������ȫ·��
		String path=servletclass.getText();
		//��ȡClass����
		Class clazz=Class.forName(path);
		//��ȡʵ��
		HelloServlet hello=(HelloServlet) clazz.newInstance();
		//��ȡ����
		Method m=clazz.getDeclaredMethod("run");
		m.setAccessible(true);
		m.invoke(hello);
	}

}

package com.itcast.dom4j;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference.Elements;



public class Dom4jTest {
	
	public static void main(String[] args) {
		try {
			run6();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * XPATH��֧��
	 * @throws Exception
	 */
	public static void run6() throws Exception{
		
		SAXReader reader=new SAXReader();
		Document document=reader.read("WebContent/xml/book2.xml");
		//List<Node> list=document.selectNodes("/���/��/����");
		List<Node> list=document.selectNodes("//����");
		Node author2=list.get(1);
		System.out.println(author2.getText());
	}

	/**
	 * ɾ���ӽڵ�
	 */
	public static void run4() throws Exception{
		//��ȡ����������
		SAXReader reader=new SAXReader();
		//����XML������Document����
		Document document=reader.read("WebContent/xml/book2.xml");
		//��ȡ���ڵ�
		Element root=document.getRootElement();	
		//��ȡè
		Element book2=(Element) root.elements("��").get(1);
		Element cat=book2.element("ë");
		//ͨ��è��ȡ���ڵ�
		//cat��getParent();
		//ͨ�����ڵ�ɾ��è
		book2.remove(cat);
		//��д
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter writer=new XMLWriter(new FileOutputStream("WebContent/xml/book2.xml"),format);
		writer.write(document);
		writer.close();
		
	}
	/**
	 * �޸��ӽڵ�����
	 * @throws Exception 
	 */
	public static void run5() throws Exception {
		//��ȡ������
		SAXReader reader=new SAXReader();
		//����XML,����Document����
		Document document=reader.read("WebContent/xml/book2.xml");
		//��ȡ���ڵ�
		Element root=document.getRootElement();
		//��ȡ��ǩ�Ľڵ�
		Element book2=(Element) root.elements("��").get(1);
		Element dog=(Element) book2.elements("�µ�").get(1);
		dog.setText("Сè");
		//��д
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter writer=new XMLWriter(new FileOutputStream("WebContent/xml/book2.xml"),format);
		writer.write(document);
		writer.close();
	}

	
	
	/**
	 * �ڵڶ���������߱�ǩ֮ǰ����±�ǩ
	 */
	public static void run3() throws Exception{
		//List
		//��ȡ����������
		SAXReader reader=new SAXReader();
		//����XML������Document����
		Document document=reader.read("WebContent/xml/book2.xml");
		//��ȡ���ڵ�
		Element root=document.getRootElement();
		//��ȡ�ڶ�����
		Element book2=(Element) root.elements("��").get(1);
		//��ȡ���������ӽڵ�,����List����
		List<Element> list=book2.elements();
		//����Ԫ�ض��� DocumentHelper.createElement("�µ�")
		Element dog=DocumentHelper.createElement("�µ�");
		dog.setText("����һ���µı�ǩ");
		//list.add(index,Element)
		list.add(4,dog);
		//��д
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter writer=new XMLWriter(new FileOutputStream("WebContent/xml/book2.xml"),format);
		writer.write(document);
		writer.close();
		
	}

	

	/**
	 * ����ӽڵ�
	 */
	public static void run2() throws Exception{
		//��ȡ��������
		SAXReader reader=new SAXReader();
		//����XML������Document����
		Document document=reader.read("WebContent/xml/book2.xml");
		//��ȡ���ڵ�
		Element root=document.getRootElement();
		//��ȡ�ڶ�����
		Element book2=(Element) root.elements("��").get(1);
		//����ֱ����ǰ������������ӽڵ㣬�����ı�����
		book2.addElement("ë").setText("����ë");
		//��д
		//����Ư����ʽ
		OutputFormat format=OutputFormat.createPrettyPrint();
		//���ñ���
		format.setEncoding("utf-8");
		
		//��д��
		XMLWriter writer=new XMLWriter(new FileOutputStream("WebContent/xml/book2.xml"),format);
		//��д���ĵ�����
		writer.write(document);
		//�ر���
		writer.close();
		
	}

	
	
	/**
	 * ��ȡ���ߵ�����
	 * 
	 */
	public static void run1() throws Exception{
		//��ȡ����������
		SAXReader reader=new SAXReader();
		//����XML������Document����
		Document document=reader.read("WebContent/xml/book2.xml");
		//��ȡ���ڵ㣨��ܱ�ǩ��
		Element root=document.getRootElement();
		//��ȡ��Ľڵ㣬��ȡ�ڶ�����
		List<Element> books=root.elements("��");
		Element book2=books.get(0);
		//��ȡ���ߵı�ǩ
		Element author2=book2.element("����");
		//��ȡ�ı�����
		System.out.println(author2.getText());
		
	}

}

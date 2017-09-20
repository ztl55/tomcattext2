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
 * 	jaxp��dom����xml
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
		//��ȡ������������
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//��ȡ����������
		DocumentBuilder builder=factory.newDocumentBuilder();
		//����xml���ĵ�������document����
		org.w3c.dom.Document document=builder.parse("WebContent/xml/book2.xml");
		//��ȡ���߶���ļ��ϣ�����NodeList
		NodeList nodeList=document.getElementsByTagName("����");
		//ѭ���������õ�ÿһ�����ߣ���ӡ�ı������ݣ�getTextContent()
		for (int i = 0; i < nodeList.getLength(); i++) {
			
			org.w3c.dom.Node node=nodeList.item(i);
			System.out.println(node.getTextContent());
		}
	}
	public static void run2() throws Exception {
		//��ȡ������
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//��ȡ������
		DocumentBuilder builder=factory.newDocumentBuilder();
		//����xml������document����
		org.w3c.dom.Document document=builder.parse("WebContent/xml/book2.xml");
		//��ȡ�ڶ�����
		org.w3c.dom.Node book2=document.getElementsByTagName("��").item(1);
		//����Ԫ�ض���
		org.w3c.dom.Element cat=document.createElement("è");
		//�����ı�����
		cat.setTextContent("����һֻè");
		//��Ԫ�ض�����ӵ��ڶ�������
		book2.appendChild(cat);
		//��д
		//������д��Ĺ���
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		//��ȡ��д��
		Transformer transformer=transformerFactory.newTransformer();
		//���û�д�ķ���
		transformer.transform(new DOMSource(document), new StreamResult("WebContent/xml/book2.xml"));
	
	}
	public static void run3() throws Exception {
		String path="WebContent/xml/book2.xml";
		//��ȡ�ĵ�����
		org.w3c.dom.Document document=JaxpDomUtil.getDocument(path);
		//��ȡè
		org.w3c.dom.Node cat=document.getElementsByTagName("è").item(0);
		//��ȡ�飨è�ĸ��ڵ㣩
		org.w3c.dom.Node book2=cat.getParentNode();
		//ͨ����ɾ��è
		book2.removeChild(cat);
		//��д
		JaxpDomUtil.writeXML(document, path);
	}
	public static void run4() throws Exception {
		String path="WebContent/xml/book2.xml";
		//��ȡ�ĵ�����
		org.w3c.dom.Document document=JaxpDomUtil.getDocument(path);
		//��ȡ��ı�ǩ
		org.w3c.dom.Element cat=(Element) document.getElementsByTagName("��").item(0);
		//�޸����ǩ�е�����
		cat.setAttribute("���", "b6");
		//��д
		JaxpDomUtil.writeXML(document, path);
	}
	public static void run5() throws Exception {
		String path="WebContent/xml/book2.xml";
		//��ȡ�ĵ�����
		org.w3c.dom.Document document=JaxpDomUtil.getDocument(path);
		//��ȡ���ߵ�Ԫ��
		Element zzuozhe=(Element) document.getElementsByTagName("����").item(0);
		//�滻Ԫ���µ��ı�
		zzuozhe.setTextContent("�������ֵ�");
		//��д
		JaxpDomUtil.writeXML(document, path);	
	}
}

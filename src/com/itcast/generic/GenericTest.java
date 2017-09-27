package com.itcast.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

public class GenericTest {
	/**
	 * ���͵ļ��ϱ���
	 * 
	 */
	@Test
	public void run1() {
		// List����
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");

		// ѭ������ ���� ��ͨfor ��ǿfor ������
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);

		}
		System.err.println("==========================");

		// ��ǿforѭ�� for(���� ����:����){}
		for (String str : list) {
			System.out.println(str);

		}
		System.out.println("==========================");
		// ������
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * set����
	 */
	@Test
	public void run2() {
		Set<String> set = new HashSet<String>();
		set.add("�ɻ�");
		set.add("����");
		set.add("����");
		set.add("����");

		// �������� ����������ǿforѭ��
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===========================");

		for (String str:set) {
			System.out.println(str);
		}
	}
	/**
	 * Map����
	 */
	@Test
	public void run3() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("aa", 11);
		map.put("bb", 22);
		map.put("cc", 33);
		
		//��������   ��ȡkey
		Set<String> keys=map.keySet();
		for(String key:keys){
			Integer value=map.get(key);
			System.out.println(key+" "+value);
			
		}
		System.out.println("=================");
		Set<java.util.Map.Entry<String, Integer>> entrys=map.entrySet();
		for(java.util.Map.Entry<String, Integer> entry:entrys){
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	/**
	 * ���߶��з��ͣ�����һ��
	 */
	public void run4() {
		List list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		List list3=new ArrayList<String>();
		List<String> list4=new ArrayList<String>();
		//List<Object> list4=new ArrayList<String>();
		//List<String> list4=new ArrayList<Object>();
		
		
	}
	
	

}

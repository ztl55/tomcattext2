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
	 * 泛型的集合遍历
	 * 
	 */
	@Test
	public void run1() {
		// List集合
		List<String> list = new ArrayList<String>();
		list.add("完美");
		list.add("旺财");
		list.add("辜负美");

		// 循环遍历 三种 普通for 增强for 迭代器
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);

		}
		System.err.println("==========================");

		// 增强for循环 for(典型 变量:集合){}
		for (String str : list) {
			System.out.println(str);

		}
		System.out.println("==========================");
		// 迭代器
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * set集合
	 */
	@Test
	public void run2() {
		Set<String> set = new HashSet<String>();
		set.add("飞机");
		set.add("王泽");
		set.add("倾听");
		set.add("白云");

		// 遍历方法 迭代器和增强for循环
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
	 * Map集合
	 */
	@Test
	public void run3() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("aa", 11);
		map.put("bb", 22);
		map.put("cc", 33);
		
		//遍历两种   获取key
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
	 * 两边都有泛型，必须一致
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

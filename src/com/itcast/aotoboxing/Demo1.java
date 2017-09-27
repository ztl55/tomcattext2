package com.itcast.aotoboxing;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Demo1 {
	@Test
	public void run1() {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		
		//自动装箱
		Integer i=1;
		//自动拆箱
		int j=i;
	}
	/*
	//JDK1.4版本的
	public void run2() {
		
		List list=new ArrayList();
		list.add(new Integer(1));
		
		//自动装箱
		Integer i=new Integer(1);
		//自动拆箱
		int j=i.intValue();
	}
*/
	
}

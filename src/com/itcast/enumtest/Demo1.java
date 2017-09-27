package com.itcast.enumtest;

import org.junit.Test;

import com.sun.org.apache.xerces.internal.impl.xs.identity.ValueStore;

public class Demo1{
	@Test
	public void run1() {
		//獲取枚舉對象
		Love gir1=Love.GIRL;
		//獲取名稱
		System.out.println(gir1.name());
		//獲取下標題
		System.out.println(gir1.ordinal());
		
	}
	@Test
	public void run2(){
		String name="CODEING";
		Love read=Enum.valueOf(Love.class, name);
		//獲取下標題
		System.out.println(read.ordinal());
		Love read2=Love.valueOf( name);
		System.out.println(read2.ordinal());
	}
	/**
	 * 已知枚舉下標，獲取枚舉對象名稱
	 */
	@Test
	public void run3() {
		int idx=2;
		Love[] laves=Love.values();
		Love code=laves[idx];
		System.out.println(code.name());
	}
	
}

enum Love{
	
	GIRL,READ,CODEING;
}
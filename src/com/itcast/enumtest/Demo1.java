package com.itcast.enumtest;

import org.junit.Test;

import com.sun.org.apache.xerces.internal.impl.xs.identity.ValueStore;

public class Demo1{
	@Test
	public void run1() {
		//�@ȡö�e����
		Love gir1=Love.GIRL;
		//�@ȡ���Q
		System.out.println(gir1.name());
		//�@ȡ���}
		System.out.println(gir1.ordinal());
		
	}
	@Test
	public void run2(){
		String name="CODEING";
		Love read=Enum.valueOf(Love.class, name);
		//�@ȡ���}
		System.out.println(read.ordinal());
		Love read2=Love.valueOf( name);
		System.out.println(read2.ordinal());
	}
	/**
	 * ��֪ö�e�ˣ��@ȡö�e�������Q
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
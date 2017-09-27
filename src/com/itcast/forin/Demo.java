package com.itcast.forin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Demo {
		
		@Test
		public void run1() {
			
			List<String> list=new ArrayList<String>();
			list.add("aa");
			list.add("bb");
			list.add("cc");
			System.out.println("=====================");
			for(String str:list){
				System.out.println(str);
				
			}
			System.out.println("====================");
			
			Iterator<String> it=list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
		}
}

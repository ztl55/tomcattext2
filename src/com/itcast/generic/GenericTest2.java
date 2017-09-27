package com.itcast.generic;

import java.util.Arrays;

import org.junit.Test;

public class GenericTest2 {
	@Test
	public void run1() {
		Integer [] arr=new Integer[]{1,2,3,4,5,6,7};
		change(arr, 1, 3);
		System.out.println(Arrays.toString(arr));
		String [] strarr=new String[]{"aa","bb","cc","dd","ee"};
		changes(strarr, 1, 3);
		System.out.println(Arrays.toString(strarr));
	}
	/**
	 * 自定義泛型方法
	 */
	public <T> void change(T[] arr,int i,int j) {
		T temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public <T> void changes(T[] strarr,int i,int j) {
		T temp=strarr[i];
		strarr[i]=strarr[j];
		strarr[j]=temp;
	}
	
	/**
	 * 修改i和j兩個元素的位置
	 * @param strarr
	 * @param i
	 * @param j
	 */
/*	private void Change(String[] strarr, int i, int j) {
		String temp=strarr[i];
		strarr[i]=strarr[j];
		strarr[j]=temp;
		
	}*/
	/**
	 * 修改i和j兩個元素的位置
	 * @param arr
	 * @param i
	 * @param j
	 */
/*	private void Change(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
*/	@Test
	public void run2() {
		String [] strarr=new String[]{"aa","bb","cc","dd","ee"};
		reset(strarr);
		System.out.println(Arrays.toString(strarr));
	}
	/**
	 * 顛倒所有元素
	 * @param arr
	 */
	public void reset(String[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			String temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		
	}
}

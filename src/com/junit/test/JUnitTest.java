package com.junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
		
	}
	@Before
	public void before() {
		System.out.println("before");
		
	}
	@Test
	public void eat() {
		System.out.println("eat");
		
	}
	
	@Test
	public void run() {
		System.out.println("run");
		
	}
	@After
	public void after() {
		System.out.println("after");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
		
	}
	

}

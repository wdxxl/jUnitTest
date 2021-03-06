package com.wdxxl.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class MyUnitTestWatcher {
	@Rule
	public TestWatcher rule2 = new TestWatcher(){  
	    @Override  
	    public void finished(Description description) {  
	      System.out.println(description.getMethodName()+" finished.");  
	    }  
	};  
	
	@BeforeClass	
	public static void beforeClass(){
		System.out.println("@BeforeClass");
	}
	
	@Before	
	public void before(){
		System.out.println("@Before");
	}
	
	@Test
	public void test01(){
		System.out.println("run test01");
	}
	
	@Test
	public void test02(){
		System.out.println("run test02");
	}
	
	@After
	public void after(){
		System.out.println("@After");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("@AfterClass");
	}
}

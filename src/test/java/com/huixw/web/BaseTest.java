package com.huixw.web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring-*.xml")   
public class BaseTest {
		
	long t = -1;
	
	@Before
	public void before(){
		t = System.currentTimeMillis();
		System.out.println("开始执行："+t);
	}
	
	@After
	public void after(){
		long t1 = System.currentTimeMillis();
		System.out.println("执行结束："+t1+" 共耗时："+(t1-t)+"毫秒");
	}
	
	@Test
	public void test(){
		System.out.println("aaa");
	}
}

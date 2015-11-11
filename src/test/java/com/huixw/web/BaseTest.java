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
		System.out.println("��ʼִ�У�"+t);
	}
	
	@After
	public void after(){
		long t1 = System.currentTimeMillis();
		System.out.println("ִ�н�����"+t1+" ����ʱ��"+(t1-t)+"����");
	}
	
	@Test
	public void test(){
		System.out.println("aaa");
	}
}

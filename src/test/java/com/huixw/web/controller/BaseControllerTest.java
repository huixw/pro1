package com.huixw.web.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring-*.xml")   
public class BaseControllerTest extends AbstractTransactionalJUnit4SpringContextTests  {
	
	MockServletContext msc;
	
	@Before
	private void before(){
		//测试controller可以和测试基本service一块测试，可能无法测试 拦截器
	}
}

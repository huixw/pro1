package com.huixw.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController extends BaseController {
	
	Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value={"/index","/"})
	public ModelAndView index(){
		logger.info("index|begin");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
}

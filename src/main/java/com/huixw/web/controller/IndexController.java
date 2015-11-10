package com.huixw.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huixw.web.common.Pagination;
import com.huixw.web.dao.BaseDao;
import com.huixw.web.entity.User;
import com.huixw.web.entity.UserExample;

@Controller
public class IndexController extends BaseController {
	
	Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	BaseDao baseDao;
	
	@RequestMapping(value={"/index","/"})
	public ModelAndView index(){
		logger.info("index|begin");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("name", "huixw");
		UserExample example = new UserExample();
		example.createCriteria().andAgeGreaterThan(0);
		Pagination<User> pagination = new Pagination<User>();
		pagination.setPn(2);
		pagination.setPs(1);
		pagination =  baseDao.queryPagination("user.selectByExample", example, pagination);
		List<User> users = pagination.getData();
		for(User user : users) {
			logger.info(user.getName());
			logger.info(""+pagination.getTotalCount());
		}
		User user = new User();
		user.setName("aaaaaaa");
		user.setAge(111);
		user.setRemark("1111");
		baseDao.insert("user.insert", user);
		return modelAndView;
	}
}

package com.huixw.web.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.huixw.web.common.IResult;
import com.huixw.web.entity.User;
import com.huixw.web.mapper.UserMapper;
import com.huixw.web.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserMapper userMapper;
	
	public IResult<Boolean> addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public IResult<Boolean> addUsers(List<User> users) {
		User user = new User();
		user.setName("ÀîËÄ");
		user.setAge(22);
		user.setRemark("aaa");
		userMapper.insert(user);
		return null;
	}

}

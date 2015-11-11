package com.huixw.web.service;

import java.util.List;

import com.huixw.web.common.IResult;
import com.huixw.web.entity.User;

public interface IUserService {
	
	/**
	 * 添加用户
	 * @param user
	 * @return 加的记录数 -1添加失败
	 */
	public IResult<Boolean> addUser(User user);
	
	/**
	 * 批量添加用户
	 * @param users
	 * @return 添加的记录数
	 */
	public IResult<Boolean> addUsers(List<User> users);
}
 
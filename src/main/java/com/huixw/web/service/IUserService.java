package com.huixw.web.service;

import java.util.List;

import com.huixw.web.common.IResult;
import com.huixw.web.entity.User;

public interface IUserService {
	
	/**
	 * ����û�
	 * @param user
	 * @return �ӵļ�¼�� -1���ʧ��
	 */
	public IResult<Boolean> addUser(User user);
	
	/**
	 * ��������û�
	 * @param users
	 * @return ��ӵļ�¼��
	 */
	public IResult<Boolean> addUsers(List<User> users);
}
 
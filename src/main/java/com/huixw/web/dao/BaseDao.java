package com.huixw.web.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huixw.web.common.Pagination;

@Service
public class BaseDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(String statement,Object entity) {
		return sqlSessionTemplate.insert(statement, entity);
	}
	
	public int update(String statement,Object entity) {
		return sqlSessionTemplate.update(statement, entity);
	}
	
	public int delete(String statement, Object id) {
		return sqlSessionTemplate.delete(statement, id);
	}
	
	public <E> List<E> query(String statement, Object entity){
		return sqlSessionTemplate.selectList(statement, entity);
	}
	
	public <T> Pagination<T> queryPagination(String statement,Object example,Pagination<T> pagination) {
		PageHelper.startPage(pagination.getPn(), pagination.getPs());
		List<T> data = sqlSessionTemplate.selectList(statement, example);
		PageInfo<T> page = new PageInfo<T>(data);
		pagination.setData(data);
		pagination.setTotalCount(page.getTotal());
		return pagination;
	}

	public SqlSessionTemplate getSqlSession() {
		return sqlSessionTemplate;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSessionTemplate = sqlSession;
	}
	
}

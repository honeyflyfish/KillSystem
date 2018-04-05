package com.KillSystem.DAO.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.KillSystem.DAO.UserDao;
import com.KillSystem.DAO.mapper.UserMapper;
import com.KillSystem.domain.User;

/**
 * @author xcxcxcxcx
 * 
 * 用户Dao实现类
 * 
 * 2018年4月5日
 *
 */
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}

	@Override
	public List<Map<String, User>> select(User user) {
		// TODO Auto-generated method stub
		return userMapper.select(user);
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userMapper.login(user);
	}

	@Override
	public User selectByTel_num(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectByTel_num(user);
	}

	@Override
	public int delete(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

package com.ajie.service;

import com.ajie.dao.UserDao;
import com.ajie.dao.UserDaoImpl;

/**
 * @author Sept Zhang
 * @create 2021-05-05 16:04
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao ;
	//利用Set进行动态实现值的注入
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void getUser() {
		userDao.getUser();
	}
}

package smvcMybatisTraditional.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smvcMybatisTraditional.dao.UserDao;
import smvcMybatisTraditional.entity.User;
import smvcMybatisTraditional.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User getUserByName(String name) {
		User user = null;
		user = userDao.getUserByName(name);
		return user;
	}

}

package smvcMybatisTraditional.dao;

import org.springframework.stereotype.Repository;

import smvcMybatisTraditional.entity.User;

@Repository
public interface UserDao {

	public User getUserByName(String name);
}

package cgg.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cgg.spring.mvc.dao.UserDao;
import cgg.spring.mvc.model.Users;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(Users user) {
		return this.userDao.saveUser(user);
	}
}

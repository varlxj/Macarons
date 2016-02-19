package com.fly84.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service;

import com.fly84.dao.UserDao

@Service
class UserService {
	@Autowired
	UserDao userDao;
	
	def getUsers(){
		userDao.list()
	}
}

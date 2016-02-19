package com.fly84.dao

import groovy.sql.Sql

import javax.sql.DataSource

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

import com.fly84.entity.User

@Repository
class UserDao {
	@Autowired
	private Sql sql;
	
	List<User> list(){		
		def list = new ArrayList<User>()
		sql.eachRow("select * from user") {
			def u = new User()
			u.name = it.name
			u.age = it.age
			list.add(u)
		}
		sql.close()
		list
	}
}

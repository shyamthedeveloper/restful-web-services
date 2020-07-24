package com.mylearning.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> userList = new ArrayList<User>();
	private static int idCounter= 3;
	
	static {
		userList.add(new User(1, "Shyam", new Date()));
		userList.add(new User(2, "Vaibhav", new Date()));
		userList.add(new User(3, "Shrushti", new Date()));
	}

	public List<User> findAll() {
		return userList;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++idCounter);
		}
		userList.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user: userList) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteByID(int id) {
		Iterator<User> iterator = userList.iterator();
		while(iterator.hasNext()){
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}

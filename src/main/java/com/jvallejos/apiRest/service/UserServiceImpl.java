/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvallejos.apiRest.service;

/**
 *
 * @author javiervallejossaez
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvallejos.apiRest.dao.UserDAO;
import com.jvallejos.apiRest.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<User> findAll() {
		List<User> listUsers= userDAO.findAll();
		return listUsers;
	}

	@Override
	public User findById(int id) {
		User user = userDAO.findById(id);
		return user;
	}

	@Override
	public void save(User user) {
		userDAO.save(user);

	}

	@Override
	public void deleteById(int id) {
		userDAO.deleteById(id);
	}

}




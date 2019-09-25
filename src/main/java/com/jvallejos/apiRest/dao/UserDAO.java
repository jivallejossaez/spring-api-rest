/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvallejos.apiRest.dao;

/**
 *
 * @author javiervallejossaez
 */
import java.util.List;

import com.jvallejos.apiRest.entity.User;


public interface UserDAO {
	
	public List<User> findAll();
	
	public User findById(int id);
	
	public void save(User user);
	
	public void deleteById(int id);
}
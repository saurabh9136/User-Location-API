package com.assign.userlocation.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.assign.userlocation.entity.User;

@Component
public interface AdminService {
	 void createTable();
	 User save(User userLocation);
	 List<User> findNearest(Integer count, Double latitude, Double longtitude);
	 void deleteByID(Long id);
	 List<User> getAllUsers();
}

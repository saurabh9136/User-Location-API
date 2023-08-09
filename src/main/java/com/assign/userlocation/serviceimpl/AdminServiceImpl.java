package com.assign.userlocation.serviceimpl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.userlocation.entity.User;
import com.assign.userlocation.repository.UserLocRepository;

import com.assign.userlocation.service.AdminService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	UserLocRepository repository;
	@Override
	public void createTable() {
		repository.createTable();
		
	}

	@Override
	public User save(User userLocation) {
		 return repository.save(userLocation);
	}

	@Override
	public List<User> findNearest(Integer count, Double latitude, Double longtitude) {
		return repository.findNearest(count, latitude, latitude);
	}

	@Override
	public void deleteByID(Long id) {
		
		repository.deleteById(id);
	}

	@Override
	public List<User> getAllUsers() {
		return repository.getAllUsers();
	}

	
}

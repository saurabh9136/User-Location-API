package com.assign.userlocation.serviceimpl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.userlocation.entity.User;
import com.assign.userlocation.repository.UserLocRepository;

import com.assign.userlocation.service.ReaderService;

@Service
public class ReaderServiceImpl implements ReaderService {

	@Autowired
	UserLocRepository repository;
	@Override
    public List<User> findNearest(Integer count, Double latitude, Double longtitude) {
        return repository.findNearest(count, latitude, latitude);
    }
}

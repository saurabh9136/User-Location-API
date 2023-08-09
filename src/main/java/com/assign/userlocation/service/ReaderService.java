package com.assign.userlocation.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.assign.userlocation.entity.User;

@Component
public interface ReaderService {

	// as per condition only get service providing to reader
	
	List<User> findNearest(Integer count, Double latitude, Double longtitude);
}

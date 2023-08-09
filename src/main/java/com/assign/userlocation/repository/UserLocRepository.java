package com.assign.userlocation.repository;

import java.util.List;

import com.assign.userlocation.entity.User;

public interface UserLocRepository {

	void createTable();
    User save(User user);
    List<User> findNearest(Integer limit, Double latitude, Double longitude);
    void deleteById(Long id);
    List<User> getAllUsers();
}

package com.assign.userlocation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.assign.userlocation.entity.User;
import com.assign.userlocation.service.ReaderService;

@RestController
@RequestMapping("/reader")
public class ReaderController {
	
	@Autowired
	private ReaderService service;
	
	@GetMapping("/get_users/{limit}")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, List<User>> getNearestUsers(
            @PathVariable Integer limit, @RequestParam Double latitude, @RequestParam Double longitude
    ) {
        var res = new HashMap<String, List<User>>();
        res.put("users", service.findNearest(limit, latitude, longitude));
        return res;
    }
}

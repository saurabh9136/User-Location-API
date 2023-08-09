package com.assign.userlocation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.assign.userlocation.entity.User;
import com.assign.userlocation.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private  AdminService adminService;
	
	@PostMapping("/create_data")
    @ResponseStatus(HttpStatus.OK)
    public String createUserLocationTable() {
		adminService.createTable();
        return "user_location table created";
    }
	
	@GetMapping("/get_users/{limit}")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, List<User>> getNearestUsers(
            @PathVariable Integer limit, @RequestParam Double latitude, @RequestParam Double longitude
    ) {
        var res = new HashMap<String, List<User>>();
        res.put("users", adminService.findNearest(limit, latitude, longitude));
        return res;
    }
	
	@GetMapping("/getAllUsers")
	@ResponseStatus(HttpStatus.OK)
	public Map<String, List<User>> getAllUserData() {
		var res = new HashMap<String, List<User>>();
		res.put("users", adminService.getAllUsers());
		return res;
	}
	
 	@PostMapping("/update_data")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Object> updateUserLocation(@RequestBody User userLocation) {
        var res = new HashMap<String, Object>();
        res.put("message", "User location updated");
        res.put("userLocation", adminService.save(userLocation));
        return res;
    }
 	
 	@DeleteMapping("delete_data")
 	public void deleteUserById(long id) {
 		adminService.deleteByID(id);
 	}
 	
	
	
}

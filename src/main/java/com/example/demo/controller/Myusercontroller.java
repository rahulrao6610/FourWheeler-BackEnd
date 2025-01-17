package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Myuserservice;

@RestController
@CrossOrigin("*")
public class Myusercontroller {
	
	@Autowired
	Myuserservice myuserser;
	
    @GetMapping("four-wheeler/user/isValidUser")
	public boolean checkUser(@RequestParam String userName,String password) {
    	 System.out.println("from React Data---->");
    	 System.out.println("from React Data"+userName);
    	 System.out.println("from React Data"+password);
    	 
    	 Boolean res=myuserser.checkUserIsValid(userName,password);
		return res;
		
	}
	
	
	
}

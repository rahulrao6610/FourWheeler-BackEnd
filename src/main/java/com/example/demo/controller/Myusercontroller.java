package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Myusercontroller {
     @GetMapping("four-wheeler/user/isValidUser")
	public boolean checkUser(@RequestParam String userName,String password) {
    	 System.out.println("from React Data---->");
    	 System.out.println("from React Data"+userName);
    	 System.out.println("from React Data"+password);
		return false;
		
	}
	
	
	
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Myuser;
import com.example.demo.repo.Myuserrepo;

@Service
public class Myuserservice {

	@Autowired
	Myuserrepo myuserrepo;
	public Boolean checkUserIsValid(String userName, String password) {
		
		Boolean res=false;
		Myuser myuser=myuserrepo.findById(userName).orElse(new Myuser());
		if(myuser.getUserName()!=null) {
		   if(myuser.getUserName().contentEquals(userName)) {
			 if(myuser.getPassword().contentEquals(password)) {
	            res = true;
		}
	}
}
	return res;
	}
}

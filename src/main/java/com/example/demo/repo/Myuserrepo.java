package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Myuser;

public interface Myuserrepo extends JpaRepository<Myuser, String> {

}

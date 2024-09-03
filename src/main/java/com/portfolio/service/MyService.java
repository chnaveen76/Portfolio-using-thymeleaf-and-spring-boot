package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.entity.User;
import com.portfolio.repository.MyRepository;

@Service
public class MyService {
	@Autowired
	MyRepository repo;

	public void saving(User user) {
		repo.save(user);
	}

}

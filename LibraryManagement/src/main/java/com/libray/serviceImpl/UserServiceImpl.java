package com.libray.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libray.entity.User;
import com.libray.repository.UserRepository;
import com.libray.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired UserRepository userRepository;
	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

}

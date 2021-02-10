package com.Cubereum.ServiceImp;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cubereum.Models.User;
import com.Cubereum.Repository.UserRepository;
import com.Cubereum.Service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(id).get();

		return user;
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void deleteById(long id) {
		userRepository.deleteById(id);

	}

	@Override
	public User findBymobilenumber(String mobilenumber) {
		User user = userRepository.findByMobileNumber(mobilenumber);

		return user;
	}

	@Override
	public User findByusername(@Valid String username) {
		
		User user= userRepository.findByUserName(username);
		return user;
	}

}

package com.Cubereum.Service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.Cubereum.Models.User;

public interface UserService {

	User saveUser(User user);

	User getUserById(long id);

	List<User> getAllUser();

	void deleteById(long id);

	User findBymobilenumber(String mobilenumber);

	User findByusername(@Valid String username);

}

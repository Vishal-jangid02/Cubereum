package com.Cubereum.Repository;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Cubereum.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{


	User findByMobileNumber(String mobilenumber);

	User findByUserName(@Valid String username);
	
	
}

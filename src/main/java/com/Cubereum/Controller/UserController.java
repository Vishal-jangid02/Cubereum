package com.Cubereum.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cubereum.Models.User;
import com.Cubereum.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService; 
	
	
	@PostMapping("/saveUser") 
	public ResponseEntity<User> createAndUpdate(@RequestBody @Valid User user) {
		
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.OK);
		
	}
	
	@GetMapping("/userById/{id}")
	public ResponseEntity<User> findUserById(@PathVariable("id") @Valid long id){
		
		User user=userService.getUserById(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/allUser")
	public List<User> getAllUser() {
		
		return userService.getAllUser();
	}
	
	@DeleteMapping("/deleteById/{id}")
	public HttpStatus deleteById(@PathVariable("id") @Valid long id) {
		
		userService.deleteById(id);
		
		return HttpStatus.OK;
	}
	 
	@GetMapping("/userBymobileNumber/{mobilenumber}")
	public User findByMobile(@PathVariable("mobilenumber")@Valid String mobilenumber) {
		
		User user = userService.findBymobilenumber(mobilenumber);
		return user;
	}
	
	@GetMapping("/userByuserName/{username}")
	public User findByUsername(@PathVariable("username")@Valid String username) {
		
		User user = userService.findByusername(username);
		
		return user;
	}
}

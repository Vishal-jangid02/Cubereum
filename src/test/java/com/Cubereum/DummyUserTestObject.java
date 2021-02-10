package com.Cubereum;

import java.util.ArrayList;
import java.util.List;

import com.Cubereum.Models.User;
import com.Cubereum.Models.UserAddress;

public class DummyUserTestObject {

	public static User getUserDummyDetails() {
		
		User user = new User();
		user.setFirstName("Nikhil");
		user.setLastName("Kumar");
		user.setUserName("nik");
		user.setEmail("niks@gmail.com");
		user.setMobileNumber("7976324566");
		user.setUseraddress(getUserDummyAddress());
		
		return user;
	}
	
	public static List<UserAddress> getUserDummyAddress() {
		
		List<UserAddress> userAddressList = new ArrayList<UserAddress>();
		UserAddress userAddress = new UserAddress();
		userAddress.setLandmark("aayug hospital");
		userAddress.setCity("Bengaluru");
		userAddress.setState("karnataka");
		
		userAddressList.add(userAddress);
		
		return userAddressList;
	}
	
public static List<User> getUserDummyDetailsList() {
		
	List<User> userList = new ArrayList<User>();
	
		User userOne = new User();
		userOne.setFirstName("Nikhil");
		userOne.setLastName("Kumar");
		userOne.setUserName("nik");
		userOne.setEmail("niks@gmail.com");
		userOne.setMobileNumber("7976324566");
		userOne.setUseraddress(getUserDummyAddress());
		
		User userTwo = new User();
		userTwo.setFirstName("Nikhil");
		userTwo.setLastName("Kumar");
		userTwo.setUserName("nik");
		userTwo.setEmail("niks@gmail.com");
		userTwo.setMobileNumber("7976324566");
		userTwo.setUseraddress(getUserDummyAddress());
		
		userList.add(userOne);
		userList.add(userTwo);
		
		return userList;
	}
	
	
	
}

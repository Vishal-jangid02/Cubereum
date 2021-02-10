package com.Cubereum;

import static com.Cubereum.DummyUserTestObject.getUserDummyDetails;
import static com.Cubereum.DummyUserTestObject.getUserDummyDetailsList;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.Cubereum.Models.User;
import com.Cubereum.Repository.UserRepository;
import com.Cubereum.ServiceImp.UserServiceImp;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CubereumApplicationTests {

	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImp userService;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(CubereumApplicationTests.class);
	}
	
	
	@Test
	public void saveUserTest() {
		
		User user = getUserDummyDetails();
		
		when(userRepository.save(Mockito.any())).thenReturn(user);
		
		Assertions.assertEquals(user, userService.saveUser(user));
		
	}
	
	@Test
	public void getUserByIdTest() {
		
		User user = getUserDummyDetails();	
		user.setId(Long.valueOf(1));
		
		when(userRepository.findById(Mockito.anyLong())).thenReturn(Optional.ofNullable(user));
		
		Assertions.assertEquals(user, userService.getUserById(Long.valueOf(1)));
		
	}

	@Test
	public void getAllUserTest() {
		
		List<User> userList = getUserDummyDetailsList();
		
		when(userRepository.findAll()).thenReturn(userList);
		
		Assertions.assertEquals(userList, userService.getAllUser());
		
	}
	
	@Test
	public void findByusername() {
		
		User user = getUserDummyDetails();
		
		when(userRepository.findByUserName(Mockito.anyString())).thenReturn(user);
		
		Assertions.assertEquals(user, userService.findByusername(user.getUserName()));
		
	}
	
	@Test
	public void findBymobilenumberTest() {
		
		User user = getUserDummyDetails();
		
		when(userRepository.findByMobileNumber(Mockito.anyString())).thenReturn(user);
		
		Assertions.assertEquals(user, userService.findBymobilenumber(user.getMobileNumber()));
		
	}
	
}

package com.Cubereum.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "username can't be null")
	@Column(name = "username")
	private String userName;
	
	@NotNull(message = "firstname can't be null")
	@Column(name = "firstname")
	private String firstName;
	
	@NotNull(message = "lastname can't be null")
	@Column(name = "lastname")
	private String lastName;
	
	@NotNull(message = "email can't be null")
	@Column(name = "email")
	@Email
	private String email;
	
	@NotNull(message = "moblienmber can't be null")
	@Column(name = "moblienumber")
	private String mobileNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_user_id",referencedColumnName = "id")
	List<UserAddress> userAddress;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String userName, String firstName, String lastName, String email, String mobileNumber,
			List<UserAddress> useraddress) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.userAddress = useraddress;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<UserAddress> getUseraddress() {
		return userAddress;
	}

	public void setUseraddress(List<UserAddress> useraddress) {
		this.userAddress = useraddress;
	}
	
	
}

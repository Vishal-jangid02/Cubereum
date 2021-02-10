package com.Cubereum.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user_address")
public class UserAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long address_id;
	
	@NotNull(message = "city can't be null")
	@Column(name = "city")
	private String city;
	
	@NotNull(message = "landmark can't be null")
	@Column(name = "landmark")
	private String landmark;
	
	@NotNull(message = "state can't be null")
	@Column(name = "state")
	private String state;
	
	
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserAddress(long address_id, String city, String landmark, String state) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.landmark = landmark;
		this.state = state;
	}
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}

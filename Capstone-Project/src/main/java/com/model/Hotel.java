/**
 * 
 */
package com.model;

/**
 * @author P Gouse Peera
 *
 */

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotelId")
	private Long hotelId;
	
	@Column(name = "name")
	private String hotelName;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pincode")
	private int pincode;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
	private List<Room> rooms;

	
	public Hotel() {
		
	}

	public Hotel(Long hotelId, String hotelName, int rating, String city, int pincode, String contact, String email,
			String description) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.rating = rating;
		this.city = city;
		this.pincode = pincode;
		this.contact = contact;
		this.email = email;
		this.description = description;
	}

	
	public Long getHotelId() {
		return hotelId;
	}

	
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	
	public String getHotelName() {
		return hotelName;
	}

	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	
	public int getRating() {
		return rating;
	}

	
	public void setRating(int rating) {
		this.rating = rating;
	}

	
	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		this.city = city;
	}

	
	public int getPincode() {
		return pincode;
	}

	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	public String getContact() {
		return contact;
	}

	
	public void setContact(String contact) {
		this.contact = contact;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@JsonManagedReference
	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}

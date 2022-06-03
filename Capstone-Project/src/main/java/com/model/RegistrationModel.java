/**
 * 
 */
package com.model;

/**
 * @author P Gouse Peera
 *
 */

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "REGISTRATION")
public class RegistrationModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "FIRSTNAME")
	private String fname;
	
	@Column(name = "LASTNAME")
	private String lname;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "NUMBER")
	private String number;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ADDRESS")
	private Address addr;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "USER")
	private LoginModel user;

	public RegistrationModel() {
	
	}
	

	public RegistrationModel(Integer id, String fname, String lname, String email, String number) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.number = number;
	}

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getFname() {
		return fname;
	}

	
	public void setFname(String fname) {
		this.fname = fname;
	}

	
	public String getLname() {
		return lname;
	}

	
	public void setLname(String lname) {
		this.lname = lname;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getNumber() {
		return number;
	}

	
	public void setNumber(String number) {
		this.number = number;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public LoginModel getUser() {
		return user;
	}

	public void setUser(LoginModel user) {
		this.user = user;
	}
	
	
}

package com.service;

import java.util.List;


import com.model.Address;
import com.model.LoginModel;
import com.model.RegistrationModel;

public interface UserManagementService {

	List<RegistrationModel> findAll();

	void registerUser(RegistrationModel user);

	void updateRegistrationDetails(RegistrationModel user);

	void deleteUser(String name);

	List<LoginModel> findAllLoginDetails();

	void updateLoginDetails(LoginModel user);
	
	void updateAddressDetails(Address address);

	// List<LoginModel> findByRole(String role);

	// LoginModel findByUsername(String username);

}

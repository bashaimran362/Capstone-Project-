package com.service.impl;

import java.util.List;


//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RegistrationRepository;
import com.dao.AddressRepository;
import com.dao.LoginRepository;
import com.model.RegistrationModel;
import com.service.UserManagementService;
import com.model.Address;
import com.model.LoginModel;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	private AddressRepository addrRepos;
	
	@Autowired
	private LoginRepository loginrepos;

	@Autowired
	private RegistrationRepository repos;

	@Override
	public List<RegistrationModel> findAll() {
		System.out.println("Inside findAll() method of UserManagementServiceImpl");
		return repos.findAll();
	}

	@Override
	public void registerUser(RegistrationModel user) {
		System.out.println("Inside registerUser() method of UserManagementServiceImpl");
		repos.save(user);
	}

	@Override
	public void updateRegistrationDetails(RegistrationModel user) {
		System.out.println("Inside updateRegistrationDetails() method of UserManagementServiceImpl");
		//repos.deleteById(user.getId());
		repos.save(user);
	}

	@Override
	public void deleteUser(String name) {
		System.out.println("Inside updateRegistrationDetails() method of UserManagementServiceImpl");
		LoginModel login = loginrepos.findAll().stream().filter(l -> l.getUsername().equals(name)).findAny().get();
		repos.deleteByUser(login);
	}

	@Override
	public void updateLoginDetails(LoginModel user) {
		System.out.println("Inside updateLoginDetails() method of UserManagementServiceImpl");
		// loginrepos.deleteByUsername(user.getUsername());
		//loginrepos.deleteById(user.getId());
		loginrepos.save(user);
	}

	@Override
	public List<LoginModel> findAllLoginDetails() {
		System.out.println("Inside findAllLoginDetails() method of UserManagementServiceImpl");
		return loginrepos.findAll();
	}

	@Override
	public void updateAddressDetails(Address address) {
		addrRepos.save(address);
	}

}

/*
 * @Override public List<LoginModel> findByRole(String role) {
 * System.out.println("Inside findByRole() method of UserServiceImpl"); return
 * repos.findAll().stream().filter(user ->
 * user.getRole().equals(role)).collect(Collectors.toList()); }
 */

/*
 * @Override public LoginModel findByUsername(String username) {
 * System.out.println("Inside findByUsername() method of UserServiceImpl");
 * return repos.findAll().stream().filter(user ->
 * user.getUsername().equals(username)).findAny().get(); }
 */

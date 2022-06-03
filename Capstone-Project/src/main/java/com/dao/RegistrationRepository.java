package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import com.model.LoginModel;
import com.model.RegistrationModel;

public interface RegistrationRepository extends JpaRepository<RegistrationModel, Integer> {
	
	@Transactional
	void deleteByUser(LoginModel user);
}

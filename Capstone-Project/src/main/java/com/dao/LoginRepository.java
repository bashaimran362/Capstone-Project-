
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import com.model.LoginModel;


public interface LoginRepository extends JpaRepository<LoginModel, Long> {

	@Transactional
	void deleteByUsername(String name);
}

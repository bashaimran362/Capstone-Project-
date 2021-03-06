package com.hotel_mgt.flavours_hotel.login_config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.hotel_mgt.flavours_hotel.model.Roles;
import com.hotel_mgt.flavours_hotel.repo.RolesRepo;

@Component
public class CustomLogoutSuccessHandler implements LogoutSuccessHandler {

	@Autowired
	RolesRepo rolesRepo;
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		Roles roles=rolesRepo.findById(authentication.getName()).orElse(null);
		if(roles.getRole().equalsIgnoreCase("ADMIN")) {
			response.sendRedirect("/admin");
		}
		else if(roles.getRole().equalsIgnoreCase("RECEPTIONIST")) {
			response.sendRedirect("/receptionist");
		}
		else if(roles.getRole().equalsIgnoreCase("CUSTOMER")) {
			response.sendRedirect("/");
		}

	}

}

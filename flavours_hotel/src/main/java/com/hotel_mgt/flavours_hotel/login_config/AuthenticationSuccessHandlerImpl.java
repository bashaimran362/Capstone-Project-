package com.hotel_mgt.flavours_hotel.login_config;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.hotel_mgt.flavours_hotel.model.Roles;
import com.hotel_mgt.flavours_hotel.repo.AdminRepo;
import com.hotel_mgt.flavours_hotel.repo.CustomerRepo;
import com.hotel_mgt.flavours_hotel.repo.RolesRepo;
import com.hotel_mgt.flavours_hotel.services.ReceptionistLogInService;

@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

	@Autowired
	ReceptionistLogInService receptionistLogInService;
	@Autowired
	RolesRepo rolesRepo;
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
			
			Roles roles=rolesRepo.findById(request.getParameter("emailId")).orElse(null);
			request.getSession().setAttribute("emailId",request.getParameter("emailId"));
			if(roles.getRole().equalsIgnoreCase("ADMIN")) {
				request.getSession().setAttribute("rname", adminRepo.findById(request.getParameter("emailId")).orElse(null).getName());
				request.setAttribute("role", "Admin");
				response.sendRedirect("/admin/admin-dashboard.jsp");
				
			}
			else if(roles.getRole().equalsIgnoreCase("RECEPTIONIST")) {
				request.getSession().setAttribute("rname", receptionistLogInService.getReceptionistName(request.getParameter("emailId")));
				request.setAttribute("role", "Receptionist");
			response.sendRedirect("/receptionist/dashboard.jsp");
			}
			else if(roles.getRole().equalsIgnoreCase("CUSTOMER")) {
				request.getSession().setAttribute("rname", customerRepo.findById(request.getParameter("emailId")).orElse(null).getUserName());
				request.setAttribute("role", "Customer");
			response.sendRedirect("/customer/user-dashboard.jsp");
			}
	}

}

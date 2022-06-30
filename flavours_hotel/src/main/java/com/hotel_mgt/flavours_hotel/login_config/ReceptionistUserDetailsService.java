package com.hotel_mgt.flavours_hotel.login_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hotel_mgt.flavours_hotel.model.AdminLogin;
import com.hotel_mgt.flavours_hotel.model.Customer;
import com.hotel_mgt.flavours_hotel.model.ReceptionistLogIn;
import com.hotel_mgt.flavours_hotel.model.Roles;
import com.hotel_mgt.flavours_hotel.repo.AdminRepo;
import com.hotel_mgt.flavours_hotel.repo.CustomerRepo;
import com.hotel_mgt.flavours_hotel.repo.ReceptionistRepo;
import com.hotel_mgt.flavours_hotel.repo.RolesRepo;

@Service
public class ReceptionistUserDetailsService implements UserDetailsService {
	
	@Autowired
	ReceptionistRepo receptionistRepo;
	
	@Autowired
	RolesRepo rolesRepo;
	
	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	CustomerRepo customerRepo;

	
	@Override
	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
		
		//ReceptionistLogIn receptionist=receptionistRepo.findById(emailId).orElse(null);
		Roles roles=rolesRepo.findById(emailId).orElse(null);
		System.out.println(emailId);
		UserDetails user=null;
		if(roles==null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		else if(roles.getRole().equalsIgnoreCase("ADMIN")) {
			
			AdminLogin admin=adminRepo.findById(emailId).orElse(null);
			if(admin==null)
				throw new UsernameNotFoundException("User Not Found");
		user = User.withUsername(admin.getEmailId()).password(admin.getPassword()).authorities("ADMIN").roles("ADMIN").build();
			
		}
		else if(roles.getRole().equalsIgnoreCase("RECEPTIONIST")) {
		
			ReceptionistLogIn receptionist=receptionistRepo.findById(emailId).orElse(null);
			if(receptionist==null)
				throw new UsernameNotFoundException("User Not Found");
			user=User.withUsername(receptionist.getEmailId()).password(receptionist.getPassword()).authorities("RECEPTIONIST").roles("RECEPTIONIST").build();
		
		}
		else if(roles.getRole().equalsIgnoreCase("CUSTOMER")) {
			
			Customer customer=customerRepo.findById(emailId).orElse(null);
			if(customer==null)
				throw new UsernameNotFoundException("User Not Found");
			user=User.withUsername(customer.getUserEmail()).password(customer.getPassword()).authorities("CUSTOMER").roles("CUSTOMER").build();
		
		}
		return user;
		
	}

}

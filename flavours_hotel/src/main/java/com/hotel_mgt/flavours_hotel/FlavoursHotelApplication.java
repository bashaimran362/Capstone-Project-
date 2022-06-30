package com.hotel_mgt.flavours_hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.controllers.AddCustomerController;
import com.hotel_mgt.flavours_hotel.controllers.AddNewServicesController;
import com.hotel_mgt.flavours_hotel.controllers.AddReceptionistController;
import com.hotel_mgt.flavours_hotel.controllers.AddServicesController;
import com.hotel_mgt.flavours_hotel.controllers.BookRoomController;
import com.hotel_mgt.flavours_hotel.controllers.BookingHistoryController;
import com.hotel_mgt.flavours_hotel.controllers.BookingInfoController;
import com.hotel_mgt.flavours_hotel.controllers.CheckBillController;
import com.hotel_mgt.flavours_hotel.controllers.CheckOutController;
import com.hotel_mgt.flavours_hotel.controllers.CustomerBillCheckController;
import com.hotel_mgt.flavours_hotel.controllers.CustomersController;
import com.hotel_mgt.flavours_hotel.controllers.LogOutController;
import com.hotel_mgt.flavours_hotel.controllers.ReceptionistLogInController;
import com.hotel_mgt.flavours_hotel.controllers.RoomBookingController;
import com.hotel_mgt.flavours_hotel.controllers.RoomsController;
import com.hotel_mgt.flavours_hotel.controllers.ShowAllReceptionistsController;
import com.hotel_mgt.flavours_hotel.controllers.UpdateCustomerProfileController;

@SpringBootApplication
@Controller
@ComponentScan(basePackages="com.hotel_mgt.flavours_hotel")
public class FlavoursHotelApplication {
	
	static ApplicationContext context=null;
	public static void main(String[] args) {
		SpringApplication.run(FlavoursHotelApplication.class, args);
	}
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("/customer/index.jsp");
	}
	@RequestMapping("/login")
	public ReceptionistLogInController login() {
		
		return new ReceptionistLogInController();
		
	}
//	@RequestMapping("/logout")
//	public LogOutController logout(){
//		
//		return new LogOutController();
//	}
	@RequestMapping(value={"/receptionist/addCustomer","/admin/addCustomer","/customer/register"})
	public AddCustomerController addCustomer() {
		
		return new AddCustomerController();
		
	}
	@RequestMapping(value={"/receptionist/availableRooms","/admin/availableRooms","/customer/availableRooms"})
	public RoomsController availableRooms() {
		return new RoomsController();
	}
	@RequestMapping("/receptionist/bookRoom")
	public RoomBookingController bookRoom() {
		return new RoomBookingController();
	}
	@RequestMapping(value={"/receptionist/bookingInfo","/admin/bookingInfo"})
	public BookingInfoController bookingInfo() {
		return new BookingInfoController();
	}
	@RequestMapping("/receptionist/addServices")
	public AddServicesController addServices() {
		return new AddServicesController();
	}
	@RequestMapping("/receptionist/checkOut")
	public CheckOutController checkOut() {
		return new CheckOutController();
	}
	@RequestMapping(value={"/receptionist/checkBill","/admin/checkBill"})
	public CheckBillController checkBill() {
		return new CheckBillController();
	}
	@RequestMapping("/receptionist/dashboard")
	public ReceptionistLogInController dashboard() {
		return new ReceptionistLogInController();
	}
	@RequestMapping(value={"/receptionist/pricing","/customer/pricing","/pricing","/admin/pricing"})
	public ModelAndView rpricing() {
		return new ModelAndView("/pricing.jsp");
	}
	@RequestMapping("/admin")
	public ModelAndView adminIndex() {
		return new ModelAndView("/admin/index.jsp");
	}
	@RequestMapping("/admin/admin-dashboard.jsp")
	public ModelAndView adminDashBoard() {
		return new ModelAndView("/admin/admin-dashboard.jsp");
	}
	@RequestMapping("/admin/showAllCustomers")
	public CustomersController showAllCustomers() {
		return new CustomersController();
	}
	
	@RequestMapping("/admin/addReceptionist")
	public AddReceptionistController addReceptionist() {
		return new AddReceptionistController();
	}
	
	@RequestMapping("/admin/showAllReceptionists")
	public ShowAllReceptionistsController showAllReceptionists() {
		return new ShowAllReceptionistsController();
	}
	@RequestMapping("/receptionist")
	public ModelAndView customerLogin() {
		return new ModelAndView("/receptionist/index.jsp");
	}
	@RequestMapping("/customer/user-dashboard")
	public ModelAndView userDashBoard() {
		return new ModelAndView("/customer/user-dashboard.jsp");
	}
	@RequestMapping("/customer/profile")
	public CustomersController userProfile() {
		return new CustomersController();
	}
	@RequestMapping("/admin/addNewServices")
	public AddNewServicesController addNewServiceController() {
		return new AddNewServicesController();
	}
	@RequestMapping("/customer/updateCustomerProfile")
	public UpdateCustomerProfileController updateCustomerProfile() {
		return new UpdateCustomerProfileController();
	}
	@RequestMapping("/customer/bookingHistory")
	public BookingHistoryController customerBookingHistory() {
		return new BookingHistoryController();
	}
	@RequestMapping("/customer/bookRoom")
	public BookRoomController customerBookRoom() {
		return new BookRoomController();
	}
	@RequestMapping("/customer/checkBill")
	public CustomerBillCheckController customerBillCheck() {
		System.out.println("hi");
		return new CustomerBillCheckController();
	}

}
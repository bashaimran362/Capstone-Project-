package com.hotel_mgt.flavours_hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.model.Bill;
import com.hotel_mgt.flavours_hotel.model.CheckBill;
import com.hotel_mgt.flavours_hotel.services.CheckBillService;

@RestController
public class CheckBillController {
	
	@Autowired
	CheckBillService checkBillService;
	
	@GetMapping(value={"/receptionist/checkBill","/admin/checkBill"})
	public ModelAndView checkBill() {
		ModelAndView mv=new ModelAndView("check-bill.jsp");
		mv.addObject("checkBill",new CheckBill());
		return mv;
	}
	@PostMapping(value={"/receptionist/checkBill","/admin/checkBill"})
	public ModelAndView checkBill(@ModelAttribute("checkBill") CheckBill checkBill) {
		ModelAndView mv=new ModelAndView("display-bill.jsp");
		List<Bill> bill=checkBillService.checkBill(checkBill);
		mv.addObject("bill",bill);
		mv.addObject("total",checkBillService.countTotalBill(bill));
		return mv;
	}

}

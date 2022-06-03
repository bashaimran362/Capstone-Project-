/**
 * 
 */
package com.util;

import java.util.List;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Hotel;
//import com.model.Room;
import com.service.HotelService;
//import com.service.RoomService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HotelController {

	@Autowired
	private HotelService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HotelController.class);
	
	@GetMapping("/hotels")
	public List<Hotel> findAll() {
		logger.info("Inside findALl() method of HotelController");
		return service.findAll();
	}

	@PostMapping("/hotel/add")
	public void createHotel(@RequestBody Hotel hotel) {
		logger.info("Inside createHotel() method of HotelController");
		service.createHotel(hotel);
	}

	@DeleteMapping("hotel/delete/{hotelId}")
	public void deleteHotel(@PathVariable Long hotelId) {
		logger.info("Inside deleteHotel() method of HotelController");
		service.deleteHotel(hotelId);
	}

	@PutMapping("hotel/update")
	public void updateHotel(@RequestBody Hotel hotel) {
		logger.info("Inside updateHotel() method of HotelController");
		service.updateHotel(hotel);
	}
	@GetMapping("/hotel/by/{hotelId}")
	public Hotel findById(@PathVariable Long hotelId) {
		logger.info("Inside findById() method of HotelServiceController");
		return service.findAll().stream().filter(id -> id.getHotelId()==hotelId).findAny().get();
	}
	
	@GetMapping("/hotel/name/{hotelName}")
	public List<Hotel> findByName(@PathVariable String hotelName){
		logger.info("Inside findByName() method of HotelServiceController");
		return service.findAll().stream().filter(name -> name.getHotelName().equals(hotelName)).collect(Collectors.toList());
	}
	
	@GetMapping("/hotel/city/{hotelCity}")
	public List<Hotel> findByCity(@PathVariable String hotelCity){
		logger.info("Inside findByCity() method of HotelServiceController");
		return service.findAll().stream().filter(name -> name.getCity().equals(hotelCity)).collect(Collectors.toList());
	}
	
	@GetMapping("/hotel/rating/{hotelRating}")
	public List<Hotel> findByRating(@PathVariable int hotelRating){
		logger.info("Inside findByRating() method of HotelServiceController");
		return service.findAll().stream().filter(name -> name.getRating()==hotelRating).collect(Collectors.toList());
	}
}

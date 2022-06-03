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
//import org.springframework.web.client.RestTemplate;

import com.model.Hotel;
import com.model.Room;
import com.service.HotelService;
import com.service.RoomService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RoomController {
	
	@Autowired
	private RoomService service;
	
	@Autowired
	private HotelService service1;
	
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(RoomController.class);
	
	@GetMapping("/rooms")
	public List<Room> findAll(){
		logger.info("Inside findAll() method of RoomController");
		return service.findAll();
	}
	
	@PostMapping("/room/add")
	public void createRoom(@RequestBody Room room) {
		logger.info("Inside createRoom() method of RoomController");
		service.createRoom(room);
	}
	
	@DeleteMapping("/room/delete/{roomId}")
	public void deleteRoom(@PathVariable Long roomId) {
		logger.info("Inside deleteRoom() method of RoomController");
		service.deleteRoom(roomId);
	}
	
	@PutMapping("/room/update")
	public void updateRoom(@RequestBody Room room) {
		logger.info("Inside updateRoom() method of RoomController");
		service.updateRoom(room);
	}
	
	@GetMapping("/room/by/{roomId}")
	public Room findById(@PathVariable Long roomId) {
		logger.info("Inside findById() method of RoomController");
		return service.findAll().stream().filter(room -> room.getId()==roomId).findAny().get();
	}
	
	@GetMapping("/rooms/hotelName/{hotelId}")
	public List<Room> findRoomsByHotelName(@PathVariable Long hotelId) {
		logger.info("Inside findRoomsByHotelName() method of RoomController --> For Customers");
		Hotel hotel = service1.findAll().stream().filter(h -> h.getHotelId()==hotelId).findAny().get();
		// List<Hotel> hotels=
		//List<Hotel> hotels=restTemplate.getForEntity("http://localhost:8888/hotels", Hotel.class);
		return hotel.getRooms().stream().filter(l -> l.isAvailability()==true).collect(Collectors.toList());
	}
	
	@GetMapping("/rooms/hotelName/{hotelId}/roomType/{type}")
	public List<Room> findRoomsByType(@PathVariable Long hotelId, @PathVariable String type){
		logger.info("Inside findRoomsByType() method of RoomController --> For Customers");
		Hotel hotel = service1.findAll().stream().filter(h -> h.getHotelId()==hotelId).findAny().get();
		return hotel.getRooms().stream().filter(l -> l.getRoomType().equals(type) && l.isAvailability()==true).collect(Collectors.toList());
	}
	
	@GetMapping("/rooms-admin/hotelName/{hotelId}")
	public List<Room> findRoomsByHotel(@PathVariable Long hotelId) {
		logger.info("Inside findRoomsByHotel() method of RoomController --> FOr Admin");
		Hotel hotel = service1.findAll().stream().filter(h -> h.getHotelId()==hotelId).findAny().get();
		return hotel.getRooms();
	}
	
	@GetMapping("/rooms-admin/hotelName/{hotelId}/roomType/{type}")
	public List<Room> findRooms(@PathVariable Long hotelId, @PathVariable String type){
		logger.info("Inside findRooms() method of RoomController --> For Admin");
		Hotel hotel = service1.findAll().stream().filter(h -> h.getHotelId()==hotelId).findAny().get();
		return hotel.getRooms().stream().filter(l -> l.getRoomType().equals(type)).collect(Collectors.toList());
	}
	
}

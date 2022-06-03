package com.service;

import java.util.List;


import com.model.Booking;

public interface BookingSerivce {

	List<Booking> findAll();

	void addBooking(Booking book);
}

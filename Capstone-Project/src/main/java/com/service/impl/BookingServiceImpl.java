package com.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookingRepository;
import com.model.Booking;
import com.service.BookingSerivce;

@Service
public class BookingServiceImpl implements BookingSerivce {

	@Autowired
	private BookingRepository repos;

	@Override
	public List<Booking> findAll() {
		return repos.findAll();
	}

	@Override
	public void addBooking(Booking book) {
		repos.save(book);
	}

}

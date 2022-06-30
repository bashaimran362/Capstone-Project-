package com.hotel_mgt.flavours_hotel.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class BookingHistory{
	
	@Id
	@SequenceGenerator(
			
			name="bhistory_id",
			sequenceName="bhistory_id",
			allocationSize=1
			
			)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="bhistory_id"
			)
	private int bhistoryId;
	private int roomNo;
	private String email;
	private Date checkInDate;
	private Date checkOutDate;
	private String typeOfRoom;
	private int adults;
	private int children;
	private long phoneNo;
	private String services;
	private String comments;
	private float bill;
	public BookingHistory(int roomNo, String email, Date checkInDate, Date checkOutDate, String typeOfRoom, int adults,
			int children, long phoneNo, String services, String comments, float bill) {
		super();
		this.roomNo = roomNo;
		this.email = email;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.typeOfRoom = typeOfRoom;
		this.adults = adults;
		this.children = children;
		this.phoneNo = phoneNo;
		this.services = services;
		this.comments = comments;
		this.bill = bill;
	}
	public BookingHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "BookingHistory [roomNo=" + roomNo + ", email=" + email + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", typeOfRoom=" + typeOfRoom + ", adults=" + adults + ", children="
				+ children + ", phoneNo=" + phoneNo + ", services=" + services + ", comments=" + comments + ", bill="
				+ bill + "]";
	}
	
	
	

}

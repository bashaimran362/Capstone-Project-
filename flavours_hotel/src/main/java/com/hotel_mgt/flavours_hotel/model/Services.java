package com.hotel_mgt.flavours_hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Services {
	
	@Id
	@SequenceGenerator(

			name = "service_id", sequenceName = "service_id", allocationSize = 1

	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "service_id")
	private int serviceId;
	private String serviceName;
	private float price;
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Services(String serviceName, float price) {
		super();
//		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.price = price;
	}
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package com.rating.entity;

public class Location {

		
	private String city;
	private String state;
	
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Location [ city=" + city
				+ ", state=" + state +  "]";
	}
	

}

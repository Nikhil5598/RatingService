package com.rating.entity;

public class Cafe {
	
	
	private String name;
	private Location location;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Cafe() {
		super();
		
	}
	@Override
	public String toString() {
		return "Cafe [name=" + name + ", location=" + location + "]";
	}
	
	
	

}

/**
 * 
 */
package com.ani.bms.event;

import com.ani.bms.domain.Schedule;

/**
 * @author aniket
 *
 */
public abstract class Event {

	private String name;
	private String location;
	private Schedule schedule;
	private PriceDetails price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public PriceDetails getPrice() {
		return price;
	}
	public void setPrice(PriceDetails price) {
		this.price = price;
	}
	
}

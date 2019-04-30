/**
 * 
 */
package com.ani.bms.booking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ani.bms.event.Event;

/**
 * @author aniket
 *
 */
public class SearchEventController {

	@Autowired
	EventRepository eventRepo;

	//@RequestMapping
	public List<Event> SearchByEventName(String eventName,String location) {
		//in real world this will make a service call and fetch all the movie/event details and then serve
		//here we will try to poll this information from a local HashMap based setup
		List<Event> events = eventRepo.getLocationEventMapping().get(location);
		List<Event> result = new ArrayList<Event>();
		events.stream().filter(Event-> eventName.equals(Event.getName())).toArray();
		
		for(Event event: events) {
			
			if (event.getName().equalsIgnoreCase(eventName)) {
				result.add(event);
			}
			
		}
		return result;
	}
 }

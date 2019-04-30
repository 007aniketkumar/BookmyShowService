/**
 * 
 */
package com.ani.bms.booking;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ani.bms.event.Event;
import com.ani.bms.event.EventType;

/**
 * @author aniket
 *
 */

@Repository
public class EventRepository {

	
	//Store details of location and event details
	private Map<String, List<Event>> locationEventMapping;
	
	
	
	public Map<String, List<Event>> getLocationEventMapping() {
		return locationEventMapping;
	} 



	public void setLocationEventMapping(Map<String, List<Event>> locationEventMapping) {
		this.locationEventMapping = locationEventMapping;
	}



	public Map<String, Map<EventType, List<Event>>> getLocationEventTypeMapping() {
		return locationEventTypeMapping;
	}



	public void setLocationEventTypeMapping(Map<String, Map<EventType, List<Event>>> locationEventTypeMapping) {
		this.locationEventTypeMapping = locationEventTypeMapping;
	}


	//store details of location and event type
	private Map<String, Map<EventType,List<Event>>> locationEventTypeMapping;
	
	
	
	void populateRepository() {
		//make a service call to the actual movies and update the above map .
		//as of now we can assume to fill this with static information, but this will be a service call and then will be updated
	}
}

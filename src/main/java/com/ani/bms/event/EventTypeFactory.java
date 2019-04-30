/**
 * 
 */
package com.ani.bms.event;

/**
 * @author aniket
 *
 */
public class EventTypeFactory {

	//This will take an event type and return the appropriate event instance
	
	
	public Event fetchEventInstance(String eventType) {
		
		switch (EventType.valueOf(eventType)) {
		case MOVIE: 
			return new MovieEvent();
		case MUSIC: 
			return new MusicEvent();	

		default:
			return null;
		}
	}
	
}

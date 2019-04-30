/**
 * 
 */
package com.ani.bms.booking;

import com.ani.bms.event.Event;

/**
 * @author aniket
 *
 *
 *This object will be created when a user books a ticket,
 *	this object will have user information,
 *	the event information
 *	price details (including taxes)
 *	
 *
 *This will then be passed to the Book Service.
 *
 *
 */
public class BookingTransaction{

	private Event eventDetails;//this will  have information of the event selected along with the booking and price details
	public Event getEventDetails() {
		return eventDetails;
	}
	public void setEventDetails(Event eventDetails) {
		this.eventDetails = eventDetails;
	}
	public int getTransactionStartTime() {
		return transactionStartTime;
	}
	public void setTransactionStartTime(int transactionStartTime) {
		this.transactionStartTime = transactionStartTime;
	}
	public int getTransactionEndTime() {
		return transactionEndTime;
	}
	public void setTransactionEndTime(int transactionEndTime) {
		this.transactionEndTime = transactionEndTime;
	}
	private int transactionStartTime;
	private int transactionEndTime;
	
	
	
}

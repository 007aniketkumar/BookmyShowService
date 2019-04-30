/**
 * 
 */
package com.ani.bms.booking;

import com.ani.bms.profile.UserProfile;

/**
 * @author aniket
 *
 *
 *This will get called when the 
 *
 */
public class BookTicketController {

	//this will take the current booking transaction and user details into consideration and will go ahead with the booking
	//in real world , this API will start a transaction as follows
	// the booking transaction has the seat details , screen details, location, movie name,and price associated with it.
	
	boolean book(BookingTransaction bookingtransaction, UserProfile currentUser) {
		// todo
		//call payment service
		// call the post processor
		
		//callPaymentService(bookingtransaction.getEventDetails().getPrice());
	
		
		
		return true;
	}
	
	
	//if the above is successful, then notify the user that the booking is successful else let the user know that booking has failed ,
	//and update the booked slot to not booked, so that it can be used for booking again.
}

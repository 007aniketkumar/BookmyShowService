/**
 * 
 */
package com.ani.bms.profile;

import java.util.List;

import com.ani.bms.booking.BookingTransaction;

/**
 * @author aniket
 *
 */
public class UserProfile {

	
	private String userName;
	private String password;
	public List<BookingTransaction> getTransactionHistory() {
		return transactionHistory;
	}
	public void setTransactionHistory(List<BookingTransaction> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	private List<BookingTransaction>  transactionHistory;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

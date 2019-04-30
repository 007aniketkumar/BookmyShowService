/**
 * 
 */
package com.ani.bms.domain;

/**
 * @author aniket
 *
 */
public class MovieDomain {

	private String rating;
	private String trailer;
	private String []reviews;//to do , reviews in itself can be complex , like they can be anonymous or tied with a user
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public String[] getReviews() {
		return reviews;
	}
	public void setReviews(String[] reviews) {
		this.reviews = reviews;
	}
}

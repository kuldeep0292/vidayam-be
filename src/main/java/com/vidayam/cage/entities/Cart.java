package com.vidayam.cage.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	int cartid;
	String bookid;
	String qty;
	String dateadded;

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getDateadded() {
		return dateadded;
	}

	public void setDateadded(String dateadded) {
		this.dateadded = dateadded;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", bookid=" + bookid + ", qty=" + qty + ", dateadded=" + dateadded + "]";
	}

}

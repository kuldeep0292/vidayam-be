package com.vidayam.cage.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	int id;
	String description;
	String language;
	String rating;
	String ratingusers;
	int sellingprice;
	int actualprice;
	int discount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRatingUsers() {
		return ratingusers;
	}

	public void setRatingUsers(String ratingUsers) {
		this.ratingusers = ratingUsers;
	}

	public int getSellingprice() {
		return sellingprice;
	}

	public void setSellingprice(int sellingprice) {
		this.sellingprice = sellingprice;
	}

	public int getActualprice() {
		return actualprice;
	}

	public void setActualprice(int actualprice) {
		this.actualprice = actualprice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", description=" + description + ", language=" + language + ", rating=" + rating
				+ ", ratingUsers=" + ratingusers + ", sellingprice=" + sellingprice + ", actualprice=" + actualprice
				+ ", discount=" + discount + "]";
	}

}

package com.vidayam.cage.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vidayam.cage.entities.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {
	
	@Modifying
	@Query(value = "INSERT INTO cart (cartid,bookid, qty, dateadded) VALUES (123,:id, '1', now())", nativeQuery = true)
	@Transactional
	void saveToCart(@Param("id") int itemId);

	@Modifying
	@Query(value = "DELETE FROM cart where cartid=:id", nativeQuery = true)
	@Transactional
	void deleteFromCart(@Param("id") int itemId);

}



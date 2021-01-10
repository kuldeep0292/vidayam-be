package com.vidayam.cage.core;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidayam.cage.entities.Books;
import com.vidayam.cage.entities.Cart;
import com.vidayam.cage.repo.BooksRepo;
import com.vidayam.cage.repo.CartRepo;

@RestController
@CrossOrigin(origins = "*")
public class BooksController {
	@Autowired
	BooksRepo bookrepo;
	@Autowired
	CartRepo cartrepo;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping(path = "/jpa/getBooks")
	public List<Books> getCarDetails() {
		List<Books> books = bookrepo.findAll();
		return books;
	}

	@GetMapping("getBooks/{id}")
	public Optional<Books> getCarDetail(@PathVariable("id") int aid) {
		Optional<Books> book = bookrepo.findById(aid);
		return book;
	}

	@PostMapping("/jpa/saveToCart/{id}")
	public String saveToCart(@PathVariable("id") int itemId) {
		 //return jdbcTemplate.update("INSERT INTO cart (cartid,bookid, qty, dateadded) VALUES (12312, '1','1', now())");
		cartrepo.saveToCart(itemId);
		return "Done";
	}
	
	@DeleteMapping("/jpa/deleteItem/{id}")
	public String deleteItem(@PathVariable("id") int itemId) {
		cartrepo.deleteFromCart(itemId);
		return "Done";
	}

	@GetMapping(path = "/jpa/getItemsInCart")
	public List<Cart> getItemsInCart() {
		List<Cart> itemsInCart = cartrepo.findAll();
		return itemsInCart;
	}
}

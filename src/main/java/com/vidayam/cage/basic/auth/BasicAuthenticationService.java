package com.vidayam.cage.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class BasicAuthenticationService {
	@GetMapping(path = "basicAuth")
	public String basicAuth() {
		return "Authentication Successful";
	}
}

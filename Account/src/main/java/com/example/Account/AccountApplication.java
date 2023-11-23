package com.example.Account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);

	}

	@RestController
	class BonjourController {

		@GetMapping("/bonjour")
		public String afficherBonjour() {
			return "Bonjour";
		}
	}

}

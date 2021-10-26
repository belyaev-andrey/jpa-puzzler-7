package com.jokerconf.jpapuzzlers;

import com.jokerconf.jpapuzzlers.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPuzzler7Application implements CommandLineRunner {

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaPuzzler7Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ownerRepository.findOwnersByPhoneNumber("11-11-11").forEach(System.out::println);
	}
}
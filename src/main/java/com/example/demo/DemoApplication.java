package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beer.service.BeerService;
import com.example.demo.enums.BeerType;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private BeerService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		service.process(BeerType.ALE.getName());
		service.process(BeerType.IPA.getName());
		service.process(BeerType.STOUT.getName());
	}

}

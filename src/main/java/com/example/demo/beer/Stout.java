package com.example.demo.beer;

import org.springframework.stereotype.Component;

import com.example.demo.enums.BeerType;

@Component
public class Stout implements Beer{

	@Override
	public void drink() {
		System.out.println("Drink a stout beer");
		
	}

	@Override
	public String label() {
		return BeerType.STOUT.name();
	}

}

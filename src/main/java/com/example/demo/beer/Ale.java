package com.example.demo.beer;

import org.springframework.stereotype.Component;

import com.example.demo.enums.BeerType;

@Component
public class Ale implements Beer{

	@Override
	public void drink() {
		System.out.println("Drink a ale beer");
	}

	@Override
	public String label() {
		return BeerType.ALE.name();
	}

}

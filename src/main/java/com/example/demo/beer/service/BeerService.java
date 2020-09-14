package com.example.demo.beer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beer.Beer;
import com.example.demo.beer.factory.AbstractFactory;

@Service
public class BeerService {
	
	@Autowired
	private AbstractFactory<Beer> factory;
	
	public void process(String beer) {
		Beer beerBean = factory.create(beer);
		beerBean.drink();
	}

}

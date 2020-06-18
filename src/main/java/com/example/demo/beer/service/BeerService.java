package com.example.demo.beer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beer.Beer;
import com.example.demo.beer.factory.FactoryBeer;

@Service
public class BeerService {
	
	@Autowired
	private FactoryBeer factory;
	
	public void process(String beer) {
		Beer beerBean = factory.create(beer);
		beerBean.drink();
	}

}

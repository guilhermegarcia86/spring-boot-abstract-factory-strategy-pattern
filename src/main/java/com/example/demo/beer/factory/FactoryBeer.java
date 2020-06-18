package com.example.demo.beer.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.beer.Beer;
import com.example.demo.enums.BeerType;

@Component
public class FactoryBeer implements AbstractFactory<Beer> {
	
	@Autowired
	private ApplicationContext context;

	@Override
	public Beer create(String type) {
		
		return context.getBean(BeerType.of(type).getType());
	}

}

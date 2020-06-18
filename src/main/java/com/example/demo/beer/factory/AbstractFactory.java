package com.example.demo.beer.factory;

public interface AbstractFactory<T> {
	
	T create(String type);

}

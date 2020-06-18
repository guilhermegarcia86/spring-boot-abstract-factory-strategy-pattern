package com.example.demo.enums;

import java.util.Arrays;

import com.example.demo.beer.Ale;
import com.example.demo.beer.Beer;
import com.example.demo.beer.Ipa;
import com.example.demo.beer.Stout;

public enum BeerType {
	
	ALE("Ale", Ale.class),
	IPA("Ipa", Ipa.class),
	STOUT("Stout", Stout.class);
	
	private String name;
	private Class<? extends Beer> type;
	
	BeerType(String name, Class<? extends Beer> type){
		this.name = name;
		this.type = type;
	}
	
    public static BeerType of(String value) {

        return Arrays.stream(values()).filter(type -> type.name.equalsIgnoreCase(value)).findFirst().get();
    }
	
	public String getName() {
		return name;
	}
	
	public Class<? extends Beer> getType(){
		return type;
	}

}

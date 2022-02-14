package com.example.producingwebservice;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, String> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		countries.put("SI", "Slovenia");
		
		countries.put("GB", "United Kingdom");

		countries.put("DE", "Germany");
	}

	public String findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name.toUpperCase());
	}
}

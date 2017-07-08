package edu.vj.java.basics;

import edu.vj.java.services.CurrencyService;

public class WorkingWithArrays {

	public static void main(String[] args) {
		CurrencyService currencyService = new CurrencyService();
		boolean foundCurrencyCode = currencyService.findCurrencyCode("EUR");
		System.out.println("foundCurrencyCode = "+ foundCurrencyCode);
	}
	
	
	
}

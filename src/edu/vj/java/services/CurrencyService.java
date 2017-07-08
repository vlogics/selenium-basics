package edu.vj.java.services;

public class CurrencyService {
	//write a method find a specific value in array
		public boolean findCurrencyCode(String currencyCode){
			String [] currencyCodes = {"USD","EUR","INR","SGD"};
			for(String code : currencyCodes){
				System.out.println(" reading currency code : "+ code);
				if(code.equals(currencyCode)){
					return true;
				}
			}
			return false;
		}
}

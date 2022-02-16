package com.org.gen.day5;

import java.util.Arrays;
import java.util.List;

public class Service {

	public void validEmail(String email) {
		if(!isDOmainValid(email)) {
			throw new DomainNotValidException("invalid email");
		}
	}

	private boolean isDOmainValid(String email) {
		// TODO Auto-generated method stub
		List<String> validDomains = Arrays.asList("gmail.com" , "genpact.com" , "outlook.com");
		if(validDomains.contains(email.substring(email.indexOf("@")+1))){
			return true;
		}
		return false;
	}
	
}

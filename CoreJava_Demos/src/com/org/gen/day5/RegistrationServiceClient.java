package com.org.gen.day5;

public class RegistrationServiceClient {
	public static void main(String[] args) {
		RegistrationService service = new RegistrationService();
        try {
            service.validateName("abc");
        } catch (NameNotFoundException e) {
            // logging and handling the situation
        }
    }
}

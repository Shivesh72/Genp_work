package com.org.gen.day5;

import java.util.Arrays;
import java.util.List;

public class RegistrationService {
	List<String> registeredName = Arrays.asList("abc", "xyz");

    public void validateName(String name) throws NameNotFoundException {
        if (registeredName.contains(name)) {
            throw new NameNotFoundException("Name Already Registered");
        }
    }
}

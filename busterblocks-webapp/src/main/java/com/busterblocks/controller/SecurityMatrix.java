package com.busterblocks.controller;

import com.busterblocks.dto.LoginDto;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SecurityMatrix {

	private static final Collection<String> SECURE_PAGES = new HashSet<>();
	static {
		SECURE_PAGES.add("rentAVideo");
		SECURE_PAGES.add("maintainMovies");
		SECURE_PAGES.add("maintainVideos");
		SECURE_PAGES.add("maintainCustomers");
	}

	private static final Map<String, String> KNOWN_LOGINS = new HashMap<>();
	static {
		KNOWN_LOGINS.put("Groovy", "Fluffy");
	}

	public static boolean requiresLogin(String page) {
		if (SECURE_PAGES.contains(page)) {
			return true;
		}
		return false;
	}

	public static boolean loginIsValid(final LoginDto loginDto) {
		if ((loginDto != null) && (loginDto.getUserName() != null) && (loginDto.getPassword() != null)) {
			final String expectedPassword = KNOWN_LOGINS.get(loginDto.getUserName());
			if (loginDto.getPassword().equals(expectedPassword)) {
				return true;
			}
		}
		return false;
	}

}

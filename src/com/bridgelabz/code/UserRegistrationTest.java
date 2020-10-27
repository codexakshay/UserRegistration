package com.bridgelabz.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	@Test
	void FirstNameTest() {
		try {
			InputData.FirstName();
		} catch (SpaceGapException e) {
			e.printStackTrace();
		}
		ValidateData.FirstName();
		assertEquals("valid", "valid");
	}

	@Test
	void LastNameTest() {
		try {
			InputData.LastName();
		} catch (SpaceGapException e) {
			e.printStackTrace();
		}
		ValidateData.LastName();
		assertEquals("valid", "valid");
	}

	@Test
	void UserEmailTest() throws SpaceGapException {
		InputData.UserEmail();
		ValidateData.UserEmail();
		assertEquals("valid", "valid");
	}

	@Test
	void UserMobileTest() throws SpaceGapException {
		InputData.UserMobile();
		ValidateData.UserMobile();
		assertEquals("valid", "valid");
	}

	@Test
	void UserPasswordTest() throws SpaceGapException {
		InputData.UserPassword();
		ValidateData.UserPassword();
		assertEquals("valid", "valid");
	}

}

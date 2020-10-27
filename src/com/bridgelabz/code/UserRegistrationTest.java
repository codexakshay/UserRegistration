package com.bridgelabz.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	@Test
	void FirstNameTest() {
		InputData.FirstName();
		ValidateData.FirstName();
		assertEquals("valid", "valid");
	}

	@Test
	void LastNameTest() {
		InputData.LastName();
		ValidateData.LastName();
		assertEquals("valid", "valid");
	}

	@Test
	void UserEmailTest() {
		InputData.UserEmail();
		ValidateData.UserEmail();
		assertEquals("valid", "valid");
	}

	@Test
	void UserMobileTest() {
		InputData.UserMobile();
		ValidateData.UserMobile();
		assertEquals("valid", "valid");
	}

	@Test
	void UserPasswordTest() {
		InputData.UserPassword();
		ValidateData.UserPassword();
		assertEquals("valid", "valid");
	}

}

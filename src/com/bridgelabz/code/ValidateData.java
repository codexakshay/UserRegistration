package com.bridgelabz.code;

import java.util.regex.Pattern;

public class ValidateData {

	public static String result = "";

	static void FirstName() {
		String regEx = "^[A-Z]+[a-z]{2,9}$";
		if (Pattern.matches(regEx, InputData.firstName)) {
			result = "valid";
		} else {
			result = "invalid";
		}
		System.out.println(result);
	}

	static void LastName() {
		String regEx = "^[A-Z]+[a-z]{2,9}$";
		if (Pattern.matches(regEx, InputData.lastName)) {
			result = "valid";
		} else {
			result = "invalid";
		}
		System.out.println(result);
	}

	static void UserEmail() {
		String regEx = "^[a-z]+[0-9]*([-_+.][0-9a-z]+)*@[0-9a-z]+[.][a-z]{2,4}([.][a-z]{2,3})*$";
		if (Pattern.matches(regEx, InputData.userEmail)) {
			result = "valid";
		} else {
			result = "invalid";
		}
		System.out.println(result);
	}

	static void UserMobile() {
		String regEx = "^[0-9]{10}$";
		if (Pattern.matches(regEx, InputData.userMobile)) {
			result = "valid";
		} else {
			result = "invalid";
		}
		System.out.println(result);
	}

	static void UserPassword() {
		String regEx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		if (Pattern.matches(regEx, InputData.userPassword)) {
			result = "valid";
		} else {
			result = "invalid";
		}
		System.out.println(result);
	}
}
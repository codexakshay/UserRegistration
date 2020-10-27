package com.bridgelabz.code;

public class UserRegistration {

	public void OperationsFlow() throws SpaceGapException {
		System.out.print("***USER REGITRATION***\n");
		InputData.FirstName();
		ValidateData.FirstName();
		InputData.LastName();
		ValidateData.LastName();
		InputData.UserEmail();
		ValidateData.UserEmail();
		InputData.UserMobile();
		ValidateData.UserMobile();
		InputData.UserPassword();
		ValidateData.UserPassword();
	}

	public static void main(String[] args) {
		UserRegistration useR = new UserRegistration();
		try {
			useR.OperationsFlow();
		} catch (SpaceGapException e) {
			System.out.println(e.getMessage()); 
		}
	}

}

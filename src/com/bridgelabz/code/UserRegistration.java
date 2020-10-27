package com.bridgelabz.code;

public class UserRegistration {

	public void OperationsFlow() {
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
		useR.OperationsFlow();
	}

}

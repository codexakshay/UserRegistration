package com.bridgelabz.code;

@FunctionalInterface
interface UserInterface
{
	public void OperationsFlow();
}

public class UserRegistration {

	public void OperationsFlow(){
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
	
	public static void main(String[] args){
		UserRegistration useR = new UserRegistration();
		UserInterface userI = () -> {
			try {
				useR.OperationsFlow();
			} catch (Exception e) {
				System.out.print(""+e.getMessage());
			}
		};
		userI.OperationsFlow();
	}
}

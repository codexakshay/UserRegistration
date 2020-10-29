package com.bridgelabz.code;

import java.util.Scanner;

public class InputData {
	static Scanner scan = new Scanner(System.in);
	static String firstName = "";
	static String lastName = "";
	static String userEmail = "";
	static String userMobile = "";
	static String userPassword = "";
	static String blanker = "";

	public static void FirstName(){
		System.out.println("\nEnter First Name : ");
		firstName = scan.next();
		}

	public static void LastName(){
		System.out.println("\nEnter Last Name : ");
		lastName = scan.next();
	}

	public static void UserEmail(){
		System.out.println("\nEnter Email : ");
		userEmail = scan.next();
	}

	public static void UserMobile(){
		System.out.println("\nEnter Mobile Number : ");
		userMobile = scan.next();
	}

	public static void UserPassword() {
		System.out.println("\nEnter User Password: ");
		userPassword = scan.next();
		scan.close();
	}

}
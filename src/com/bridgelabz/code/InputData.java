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

	public static void FirstName() throws SpaceGapException {
		System.out.println("\nEnter First Name : ");
		firstName = scan.next();
		blanker = scan.nextLine();
		if (blanker.isEmpty()) {
			throw new SpaceGapException("SpaceGap Traced");
		}
	}

	public static void LastName() throws SpaceGapException {
		System.out.println("\nEnter Last Name : ");
		lastName = scan.next();
		blanker = scan.nextLine();
		if (blanker.isEmpty()) {
			throw new SpaceGapException("SpaceGap Traced");
		}
	}

	public static void UserEmail() throws SpaceGapException {
		System.out.println("\nEnter Email : ");
		userEmail = scan.next();
		blanker = scan.nextLine();
		if (blanker.isEmpty()) {
			throw new SpaceGapException("SpaceGap Traced");
		}
	}

	public static void UserMobile() throws SpaceGapException {
		System.out.println("\nEnter Mobile Number : ");
		userMobile = scan.next();
		blanker = scan.nextLine();
		if (blanker.isEmpty()) {
			throw new SpaceGapException("SpaceGap Traced");
		}
	}

	public static void UserPassword() throws SpaceGapException {
		System.out.println("\nEnter User Password: ");
		userPassword = scan.next();
		blanker = scan.nextLine();
		if (blanker.isEmpty()) {
			throw new SpaceGapException("SpaceGap Traced");
		}
		scan.close();
	}

}
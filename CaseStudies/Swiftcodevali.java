package com.casestudies;

import java.util.Scanner;

public class Swiftcodevali {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code:");
		String str1 = sc.nextLine().trim();

		boolean isValid = true;
		String errormessage = "";

		if (str1.length() >= 4) {
			for (int i = 0; i < 4; i++) {
				if (!Character.isLetter(str1.charAt(i))) {
					isValid = false;
					errormessage = "Institution Code must be alphabetic.";
					break;
				}
			}
		}

		if (isValid && str1.length() >= 6) {
			for (int i = 4; i < 6; i++) {
				if (!Character.isLetter(str1.charAt(i))) {
					isValid = false;
					errormessage = "Country Code must be alphabetic.";
					break;
				}
			}
		}

		if (isValid && str1.length() >= 8) {
			for (int i = 6; i < 8; i++) {
				if (!Character.isLetterOrDigit(str1.charAt(i))) {
					isValid = false;
					errormessage = "Location Code contains invalid characters.";
					break;
				}
			}
		}

		if (isValid && str1.length() == 11) {
			for (int i = 8; i < 11; i++) {
				if (!Character.isLetterOrDigit(str1.charAt(i))) {
					isValid = false;
					errormessage = "Branch Code contains invalid characters.";
					break;
				}
			}
		}

		if (isValid && !(str1.length() == 8 || str1.length() == 11)) {
			isValid = false;
			errormessage = "Length must be either 8 or 11 characters.";
		}

		if (isValid) {
			System.out.println("Input " + str1 + " is valid.");
		} else {
			System.out.println("Input " + str1 + " is invalid: " + errormessage);
		}
		sc.close();
	}
}
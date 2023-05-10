package assignmentMay5;

import java.util.Scanner;

public class OnlineBanking extends BankOfOperations {
	Scanner sc = new Scanner(System.in);

	@Override
	public String changePinPassword(String onlineBankingPassword) {
		String specialCharacters = "([@,&,$])";
		String newPassword = "";
		System.out.print("Enter your old password: ");
		String oldPassword = sc.next();
		if (onlineBankingPassword.equals(oldPassword)) {
			System.out.print("Enter your new password: ");
			newPassword = sc.next();
			if (!newPassword.equals(oldPassword) && newPassword.length() == 8
					&& !newPassword.contains(specialCharacters)) {
				System.out.println("Password changed successfully.");
			} else {
				if (newPassword.length() != 8) {
					System.out.println("Password must be 8 characters long.");
				}
				if (newPassword.equals(oldPassword)) {
					System.out.println("New password cannot be the same as old password.");
				}
				if (newPassword.contains(specialCharacters)) {
					System.out.println("Special characters @, $, and & are not allowed.");
				}
			}
		} else {
			System.out.println("Incorrect password.");
		}
		return newPassword;

	}

}
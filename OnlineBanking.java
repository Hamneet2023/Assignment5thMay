package assignmentMay5;

import java.util.Scanner;

public class OnlineBanking extends BankOfOperations {
	Scanner sc = new Scanner(System.in);
	Person person = new Person();

	@Override
	public void changePinPassword(String onlineBankingPassword) {
		boolean pin = false;
		System.out.print("Enter your old password: ");
		String oldPassword = sc.next();
		if (onlineBankingPassword.equals(oldPassword) && oldPassword.length() == 8) {
			System.out.print("Enter your new password: ");
			  pin =true;
			String newPassword = sc.next();
			if (!newPassword.equals(oldPassword) && newPassword.length() == 8 && !newPassword.contains("@")
					&& !newPassword.contains("$") && !newPassword.contains("&")) {
				person.setOnlineBankingPassword(newPassword);
				System.out.println("Password changed successfully.");
			} else {
				System.out.println("Invalid new password.");
				if (newPassword.length() != 8) {
					System.out.println("Password must be 8 characters long.");
				}
				if (newPassword.equals(oldPassword)) {
					System.out.println("New password cannot be the same as old password.");
				}
				if (newPassword.contains("@") || newPassword.contains("$") || newPassword.contains("&")) {
					System.out.println("Special characters @, $, and & are not allowed.");
				}
			}
		} else {
			System.out.println("Incorrect password.");
		}
	}// changePin Password ends here

	@Override
	public void withdraw(double balance) {
		System.out.println("Enter the amount you want to withdraw:");
		int enteredAmount = sc.nextInt();
		System.out.println("Current balance in your account:" + balance);
		if (enteredAmount < balance) {
			double updatedBalance = balance - enteredAmount;
			System.out.println("updated balance in your account:" + updatedBalance);
			person.setBalance(updatedBalance);
		} else {
			System.out.println("insufficient funds");
		}
		//super.withdraw(balance);
	}

	@Override
	public void deposit(double balance) {
		System.out.println("Enter the amount you want to deposit:");
		int enteredAmount = sc.nextInt();
		System.out.println("Current balance in your account:" + balance);
		double updatedBalance = enteredAmount + balance;
		System.out.println("updated balance in your account:" + updatedBalance);
		person.setBalance(updatedBalance);
	}

	@Override
	public void viewBalance(double balance) {
		System.out.println("Current balance in your account:"+person.getBalance());
		System.out.println("updated balance in your account:"+person.setBalance(balance));
		//super.viewBalance(balance);

	}
}
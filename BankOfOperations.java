package assignmentMay5;

import java.util.Scanner;

public abstract class BankOfOperations {
	public abstract String changePinPassword(String actualPin);

	Scanner sc = new Scanner(System.in);

	public double withdraw(double balance) {
		double updatedBalance = 0.0;
		System.out.println("Enter the amount you want to withdraw:");
		int enteredAmount = sc.nextInt();
		System.out.println("Current balance in your account:" + balance);
		if (enteredAmount < balance) {
			updatedBalance = balance - enteredAmount;
			System.out.println("updated balance in your account:" + updatedBalance);
		} else {
			System.out.println("insufficient funds");
		}
		return updatedBalance;
	}

	public double deposit(double balance) {
		double updatedBalance = 0.0;
		System.out.println("Enter the amount you want to deposit:");
		int enteredAmount = sc.nextInt();
		System.out.println("Current balance in your account:" + balance);
		updatedBalance = enteredAmount + balance;
		System.out.println("updated balance in your account:" + updatedBalance);
		return updatedBalance;
	}

	public void viewBalance(double balance) {
		System.out.println("Current balance in your account:" + balance);
	}

}
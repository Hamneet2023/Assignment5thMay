package assignmentMay5;

import java.util.Scanner;

public class ATM extends BankOfOperations {
	Scanner sc = new Scanner(System.in);
	Person person = new Person();

	@Override
	public void changePinPassword(String existingPin) {
		System.out.print("Enter your old pin: ");
		String oldPin = sc.next();
		if (existingPin.equals(oldPin) && oldPin.length() == 4) {
			System.out.print("Enter your new pin: ");
			String newPin = sc.next();
			if (!newPin.equals(oldPin) && newPin.length() == 4) {
				person.setPin(newPin);
				System.out.println("Pin changed successfully.");
			} else {
				System.out.println("Invalid new pin: must be a 4-digit number and different from the old pin.");
			}
		} else {
			System.out.println("Invalid old pin: please check it.");
		}
	}// method ends here

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
}// class ends here

package assignmentMay5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankOfOperations bank = null;
		Person person = new Person("12346789", "Hamneet", 10000, "1234", "12345678");
		Scanner sc = new Scanner(System.in);
		System.out.println("Which banking service do you want to use ATM or online banking:");
		String bankingService = sc.nextLine();
		switch (bankingService) {
		case "ATM":
			bank = new ATM();
			bank.changePinPassword(person.getPin());
			System.out.println("Please enter which operation you want to perform (Withdraw/Deposit/View Balance)");
			String operation = sc.nextLine();
			switch (operation) {
			case "Withdraw":
				bank.withdraw(person.getBalance());
				break;
			case "Deposit":
				bank.deposit(person.getBalance());
				break;
			case "View Balance":
				bank.viewBalance(person.getBalance());
				break;
			default:
				System.out.println("Enter a valid operation:");
				break;
			}
			break;
		case "Online Banking":
			bank = new OnlineBanking();
			bank.changePinPassword(person.getOnlineBankingPassword());
			System.out.println("Please enter which operation you want to perform (Withdraw/Deposit/View Balance)");
			String operation2 = sc.nextLine();
			switch (operation2) {
			case "Withdraw":
				bank.withdraw(person.getBalance());
				break;
			case "Deposit":
				bank.deposit(person.getBalance());
				break;
			case "View Balance":
				bank.viewBalance(person.getBalance());
				break;
			default:
				System.out.println("Enter a valid operation:");
				break;
			}
			break;
		default:
			System.out.println("You can perform your operation only using these two ways: ATM/OnlineBanking ");
			break;
		}
	}
}

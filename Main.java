package assignmentMay5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankOfOperations bank = null;
		PersonDetails person = new PersonDetails();
		PersonDetails Hamneet = new PersonDetails("12346789", "Hamneet", 1000.00, 1234, "8888y8");
		PersonDetails Sandeep = new PersonDetails("12346780", "Sandeep", 2000.00, 1234, "5555z");
		PersonDetails Jaspreet = new PersonDetails("12346781", "Jaspreet", 3000.00, 1234, "fff8");
		PersonDetails Harpreet = new PersonDetails("12346782", "Harpreet", 4000.00, 1234, "123hhhj");
		PersonDetails Manjit = new PersonDetails("12346782", "Manjit", 4000.00, 1234, "hhhh789j");
		PersonDetails[] personArray = { Hamneet, Sandeep, Jaspreet, Harpreet,Manjit };
		person.getpersonDetails(personArray);
		System.out.println("Enter your AccountNumber:");
		Scanner sc = new Scanner(System.in);
		String accountNumber = sc.nextLine();
		int actualAtmPin = person.getActualPin(accountNumber);
		String actualAtmPinStr = String.valueOf(actualAtmPin);
		String actualOnlineBankingPassword = person.getOnlineBankingPassword(accountNumber);
		String accountHolderNameATM = person.getAccountHolderName(accountNumber);
		System.out.println("Account holder Name is:" + accountHolderNameATM);
		double accountBalance = person.getAccountBalance(accountNumber);
		System.out.println("Which banking service do you want to use ATM or online banking:");
		String bankingService = sc.nextLine();
		switch (bankingService) {
		case "ATM":
		 bank = new ATM();
		String updatedPin =	bank.changePinPassword(actualAtmPinStr);
		int updatedPinIntPin = Integer.parseInt(updatedPin);
		person.setPin( updatedPinIntPin);
			break;
		case "Online Banking":
			bank = new OnlineBanking();
			String updateOnlineBankingPassword =bank.changePinPassword(actualOnlineBankingPassword);
			person.setOnlineBankingPassword(actualOnlineBankingPassword);	
			break;
		default:
			System.out.println("You can perform your operation only using these two ways: ATM/OnlineBanking ");
			break;
		}
		String test="operation";
		System.out.println("Enter a keyword operation to perform banking operation:");
		String storeOperation=sc.next();
		if(test.equals(storeOperation)) {
			System.out.println("Please enter which operation you want to perform (Withdraw/Deposit/View Balance)");
			String operation = sc.nextLine();
			switch (operation) {
			case "Withdraw":
				double updatedWithdrawBalance=bank.withdraw(accountBalance);
				person.setBalance(updatedWithdrawBalance);
				break;
			case "Deposit":
				double updatedDepositBalance=bank.deposit(accountBalance);
				person.setBalance(updatedDepositBalance);
				break;
			case "View Balance":
				bank.viewBalance(accountBalance);
				break;
			default:
				System.out.println("Enter a valid operation:");
				break;
			}
		}
		
	}//main method ends here

}

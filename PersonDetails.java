package assignmentMay5;

public class PersonDetails {
	private String accountNo;
	private String name;
	private double balance;
	private int pin;
	private String onlineBankingPassword;
	PersonDetails[] personList = new PersonDetails[5];

	public PersonDetails() {

	}

	public PersonDetails(String accountNo, String name, double balance, int pin, String onlineBankingPassword) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(double newBalance) {
		this.balance = newBalance;
		return newBalance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

	public void getpersonDetails(PersonDetails[] personArray) {
		for (int i = 0; i < personArray.length; i++) {
			personList[i] = personArray[i];
			// System.out.println(personList);
		}
	}

	public int getActualPin(String enteredAccountNumber) {
		int actualPin = 0;
		boolean accountExists = false;
		for (int i = 0; i < personList.length; i++) {
			if (personList[i].getAccountNo().equals(enteredAccountNumber)) {
				actualPin = personList[i].getPin();
				accountExists = true;
				break;
			}
		}
		if (!accountExists) {
			System.out.println("Account does not exist");
		}
		return actualPin;
	}

	public String getOnlineBankingPassword(String enteredAccountNumber) {
		String actualOnlineBankingPassword = "";
		boolean accountExists = false;
		for (int i = 0; i < personList.length; i++) {
			if (personList[i].getAccountNo().equals(enteredAccountNumber)) {
				actualOnlineBankingPassword = personList[i].getOnlineBankingPassword();
				accountExists = true;
				break;
			}
		}
		if (accountExists == false) {
			System.out.println("Account does not exist");
		}
		return actualOnlineBankingPassword;

	}

	public String getAccountHolderName(String enteredAccountNumber) {
		String accountHolderName = "";
		for (int i = 0; i < personList.length; i++) {
			if (personList[i].getAccountNo().equals(enteredAccountNumber)) {
				accountHolderName = personList[i].getName();
				break;
			}
		}

		return accountHolderName;
	}

	public double getAccountBalance(String enteredAccountNumber) {
		double accountBalance = 0.0;
		for (int i = 0; i < personList.length; i++) {
			if (personList[i].getAccountNo().equals(enteredAccountNumber)) {
				accountBalance = personList[i].getBalance();
				break;
			}
		}

		return accountBalance;
	}
}

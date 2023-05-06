package assignmentMay5;

public class Person {
	private String accountNo;
	private String name;
	private double balance;
	private String pin;
	private String onlineBankingPassword;
	
	public Person() {
		super();
	}

	public Person(String accountNo, String name, double balance, String pin, String onlineBankingPassword) {
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

	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}


	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
}

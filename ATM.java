package assignmentMay5;

import java.util.Scanner;

public class ATM extends BankOfOperations {
	Scanner sc = new Scanner(System.in);

	@Override
	public String changePinPassword(String existingPin) {
		String newPin = "";
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter your old pin: ");
			String oldPin = sc.next();
			if (existingPin.equals(oldPin)) {
				System.out.print("Enter your new pin: ");
				newPin = sc.next();
				if (!newPin.equals(oldPin) && newPin.length() == 4) {
					System.out.println("Pin changed successfully.");
					break;
				} else {
					System.out.println("Invalid new pin: must be a 4-digit number and different from the old pin.");
				}
			} else {
				System.out.println("Invalid old pin: please check it.");
				 if(i==3) {
					 System.out.println("card blocked:");
				 }
			}
		}
		return newPin;
	}// return pin to setpin?
}// class ends here

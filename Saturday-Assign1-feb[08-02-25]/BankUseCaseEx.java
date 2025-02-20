package Assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
	
	private String accountNumber;
	private String accountHolder;
	private double balance;

	
	public Account(String accountNumber, String accountHolder, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = initialBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}
}

class Bank {
	private Map<String, Account> accounts;

	public Bank() {
		accounts = new HashMap<>();
	}

	//Add Account
	public void addAccount(String accountNumber, String accountHolder, double initialBalance) {
		if (!accounts.containsKey(accountNumber)) {
			accounts.put(accountNumber, new Account(accountNumber, accountHolder, initialBalance));
			System.out.println("Account added successfully.");
		} else {
			System.out.println("Account number already exists.");
		}
	}

	//remove account
	public void removeAccount(String accountNumber) {
		if (accounts.remove(accountNumber) != null) {
			System.out.println("Account removed successfully.");
		} else {
			System.out.println("Account not found.");
		}
	}
 
	//deposit
	public void deposit(String accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Account not found.");
		}
	}
	
	
	//withdraw 
	public void withdraw(String accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Account not found.");
		}
	}
}

public class BankUseCaseEx {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Account Number: ");
				String accNum = scanner.nextLine();
				System.out.print("Enter Account Holder Name: ");
				String accHolder = scanner.nextLine();
				System.out.print("Enter Initial Balance: ");
				double initBalance = scanner.nextDouble();
				bank.addAccount(accNum, accHolder, initBalance);
				break;

			case 2:
				System.out.print("Enter Account Number: ");
				String depAccNum = scanner.nextLine();
				System.out.print("Enter Amount to Deposit: ");
				double depAmount = scanner.nextDouble();
				bank.deposit(depAccNum, depAmount);
				break;

			case 3:
				System.out.print("Enter Account Number: ");
				String withAccNum = scanner.nextLine();
				System.out.print("Enter Amount to Withdraw: ");
				double withAmount = scanner.nextDouble();
				bank.withdraw(withAccNum, withAmount);
				break;

			case 4:
				System.out.print("Enter Account Number to Remove: ");
				String remAccNum = scanner.nextLine();
				bank.removeAccount(remAccNum);
				break;

			case 5:
				System.out.println("Exiting..Thank you");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice...Please try again.");
			}
		}
	}
}

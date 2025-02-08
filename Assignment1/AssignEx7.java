package Assignment1;

	import java.util.HashMap;
	import java.util.Map;

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

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }
	}

	class Bank {
	    private Map<String, Account> accounts;

	    public Bank() {
	        accounts = new HashMap<>();
	    }

	    public void addAccount(String accountNumber, String accountHolder, double initialBalance) {
	        if (!accounts.containsKey(accountNumber)) {
	            accounts.put(accountNumber, new Account(accountNumber, accountHolder, initialBalance));
	            System.out.println("Account added successfully.");
	        } else {
	            System.out.println("Account number already exists.");
	        }
	    }

	    public void removeAccount(String accountNumber) {
	        if (accounts.remove(accountNumber) != null) {
	            System.out.println("Account removed successfully.");
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    public void deposit(String accountNumber, double amount) {
	        Account account = accounts.get(accountNumber);
	        if (account != null) {
	            account.deposit(amount);
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    public void withdraw(String accountNumber, double amount) {
	        Account account = accounts.get(accountNumber);
	        if (account != null) {
	            account.withdraw(amount);
	        } else {
	            System.out.println("Account not found.");
	        }
	    }
	}

	public class AssignEx7 {
	    public static void main(String[] args) {
	        Bank bank = new Bank();
	        
	        bank.addAccount("467688", "Priya", 1000.0);
	        bank.addAccount("979787", "sudha", 500.0);
	        
	        bank.deposit("987353", 200.0);
	        bank.withdraw("46330", 100.0);
	        
	        bank.removeAccount("979787");
	    }
	}

	
	
	
	
	
	
	
	
	
	
	

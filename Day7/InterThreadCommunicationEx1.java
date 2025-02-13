package com.celcom.day7;


		class BankAccount {
		    private int balance = 1000;

		    public synchronized void deposit(int amount) {
		        System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
		        balance += amount;
		        System.out.println("New Balance: " + balance);
		    }

		    public synchronized void withdraw(int amount) {
		        if (balance >= amount) {
		            System.out.println(Thread.currentThread().getName() + " withdrawing: " + amount);
		            balance -= amount;
		            System.out.println("New Balance: " + balance);
		        } else {
		            System.out.println(Thread.currentThread().getName() + " insufficient balance!");
		        }
		    }

		    public synchronized int getBalance() {
		        return balance;
		    }
		}

		public class InterThreadCommunicationEx1 {
		    public static void main(String[] args) {
		        BankAccount account = new BankAccount();

		        Runnable depositTask = () -> {
		            account.deposit(500);
		        };

		        Runnable withdrawTask = () -> {
		            account.withdraw(300);
		        };

		        Thread t1 = new Thread(depositTask, "User1");
		        Thread t2 = new Thread(withdrawTask, "User2");
		        Thread t3 = new Thread(withdrawTask, "User3");

		        t1.start();
		        t2.start();
		        t3.start();
		    }
		}



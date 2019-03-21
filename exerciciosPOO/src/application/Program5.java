package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank = null;

		System.out.print("Account number: ");
		int number = sc.nextInt();
		System.out.print("Account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("PASSWORD (xxxx): ");
		int pass = sc.nextInt();
		if (pass == 1234) {
			System.out.print("Is there an initial deposit (y/n)? ");
			char resp = sc.next().charAt(0);
	
			if (resp == 'y') {
				System.out.print("Enter initial deposit value: ");
				double initialDeposit = sc.nextDouble();
				bank = new Bank(number, holder, initialDeposit);
			} else {
				bank = new Bank(number, holder);
			}
	
			System.out.print("Do you wanna do any operations (y/n)? ");
			char cont = sc.next().charAt(0);
	
			while (cont == 'y') {
				
				System.out.printf("%n");
				System.out.printf("%n");
				System.out.println("Operations: ");
				System.out.println("Deposit: 1");
				System.out.println("Withdraw: 2");
				System.out.println("Updated account data: 3");
				System.out.println("Exit: 4");
				System.out.print("Select operation: ");
				
				int op = sc.nextInt();
				if (op == 1) {
					System.out.printf("%n");
					System.out.print("Enter a deposit value: U$ ");
					double depositValue = sc.nextDouble();
					bank.deposit(depositValue);
					System.out.printf("%n");
					System.out.println("Account data: ");
					System.out.print(bank);
					System.out.printf("%n");
				}
	
				if (op == 2) {
					System.out.print("Enter a withdraw value: U$ ");
					double withdrawValue = sc.nextDouble();
					bank.withdraw(withdrawValue);
					System.out.printf("%n");
					System.out.println("Account data: ");
					System.out.print(bank);
				}
	
				if (op == 3) {
					System.out.printf("%n");
					System.out.println("Account data: ");
					System.out.print(bank);
				}
				
				if (op == 4) {
					cont = 'n';
				}
			}
			if (cont == 'n') {
				System.out.println("Operation finalized. Thank you!");
			}
	} else {
		System.out.print("Wrong password. Restart the program.");
	}
		sc.close();
	}

}

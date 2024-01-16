package atm_mini_project;

import java.util.Scanner;

public class ATM_mini_project {

	public static final String password = "password123";
	public static final String name = "ram";

	public static void main(String[] args) {
		  int initialAmount = 1000;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String Name = scanner.nextLine();
		Name = Name.toLowerCase();
		System.out.println("Enter the password: ");
		String inputpassword = scanner.nextLine();
		inputpassword = inputpassword.toLowerCase();


		if(inputpassword.equals(password) && Name.equals(name) )  {
			while (true) {
				System.out.println("-------------------");
				System.out.println("1.Deposit");
				System.out.println("2.withdraw");
				System.out.println("3.Balance");
				System.out.println("4.payslip");
				System.out.println("5.Exit");

				System.out.println("Enter a number: ");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter a amount you want to deposit:");
					int deposit = scanner.nextInt();
					initialAmount += deposit;
					System.out.println("Amount deposited successfully..");
					break;

				case 2:
					System.out.println("Enter a amount you want to withdraw:");
					int withdraw = scanner.nextInt();
					 initialAmount -= withdraw;
					System.out.println("Rs." + withdraw + " withdrawed  successfully..");
					break;

				case 3:
					System.out.println("------> Balance...");
					System.out.println(initialAmount);

					break;
				case 4:
					System.out.println("------>Payslip");
					System.out.println("----------------------");
					System.out.println("Name: " + Name );
					System.out.println("----------------------");

					System.out.println("Balance: " + initialAmount);
					break;

				case 5:

					System.out.println("------> Thank you for using the ATM");
					System.exit(0);
					

					break;

				default:
					System.out.println("Invalid input. please give valid number.");

					break;
				}
			}
		}
		scanner.close();
	}

}

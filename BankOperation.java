import java.util.Scanner;

public class BankOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Bank\n\n Enter the number of Customers:");
		int size = sc.nextInt();
		Bank bank = new Bank(size);

		String value = "Yes";
		while (value.equalsIgnoreCase("yes")) {
			System.out.println("************MENU***********\n1. Bank operation\n2. Customer operation");
			int operation = sc.nextInt();
			if (operation == 1) {
				if (!bank.checkSpaceForNewCustomer()) {
					System.out.println("Bank customers are full");
				} else {
					System.out.println("Enter the name of the customer");
					String name = sc.next();
					if (bank.checkCustomer(name)) {
						System.out.println("Customer already exists");
					} else {
						Customer customer = new Customer();
						customer.setName(name);
						System.out.println("Enter your password");
						String password = sc.next();
						customer.setPassword(password);
						System.out.println("Enter your city");
						String city = sc.next();
						customer.setCity(city);
						System.out.println(bank.addCustomer(customer));
					}
				}
			} else if (operation == 2) {
				System.out.println("Enter your name :");
				String name = sc.next();
				System.out.println("Enter your password :");
				String pass = sc.next();
				Customer customer = bank.validateCustomer(name, pass);
				if (customer == null) {
					System.out.println("Username and password don't match");
				} else {
					System.out.println("1. Check Balance\n2. Credit amount\n 3. Debit amount\n 4. Profile");
					int val = sc.nextInt();
					switch (val) {
					case 1:
						System.out.println(customer.getBalance());
						break;
					case 2:
						System.out.println("Enter the amount for credit :");
						int cr = sc.nextInt();
						System.out.println(customer.credit(cr));
						break;
					case 3:
						System.out.println("Enter the amount for debit :");
						int db = sc.nextInt();
						System.out.println(customer.debit(db));
						break;
					case 4:
						System.out.println(customer.toString());
						break;
					default:
						System.out.println("Wrong choice");
						break;
					}
				}
			} else {
				System.out.println("Wrong choice");
			}
			System.out.println("Do you want to continue : Yes/No");
			value = sc.next();
		}
		System.out.println("Thank you");
	}
}
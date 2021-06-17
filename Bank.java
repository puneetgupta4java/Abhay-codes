
public class Bank {

	private Customer[] customers;
	private int numberOfCustomers = 0;

	public Bank(int size) {
		customers = new Customer[size];
	}

	public boolean checkCustomer(String name) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] != null && customers[i].getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	public Customer validateCustomer(String name, String password) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] != null && customers[i].getName().equalsIgnoreCase(name)
					&& customers[i].getPassword().equalsIgnoreCase(password)) {
				return customers[i];
			}
		}
		return null;
	}
	
	public String addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
		return "Welcome "+customer.getName();
	}

}

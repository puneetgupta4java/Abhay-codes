
public class Customer {

	private String name;
	private String password;
	private String city;
	private int balance;

	public Customer() {
		this.balance = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getBalance() {
		return balance;
	}

	public String credit(int value) {
		if (value < 0) {
			return "Value needs to be credited is less than 0";
		} else {
			this.balance += value;
			return "Your updated balance is " + this.balance;
		}
	}

	public String debit(int value) {
		if (this.balance < value) {
			return "Value needs to be debited is more than available balance";
		} else {
			this.balance -= value;
			return "Your updated balance is " + this.balance;
		}
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", password=" + password + ", city=" + city + ", balance=" + balance + "]";
	}

}

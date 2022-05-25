public abstract class Account implements AccountInterface {
	
	private static final int DEFAULT_AGENCY = 1;
	private static int INCREMENTAL_ACCOUNT_NUMBER = 1;
	protected int agency;
	protected int number;
	protected double amount;
	protected Client client;

	public Account(Client client) {
		this.agency = Account.DEFAULT_AGENCY;
		this.number = INCREMENTAL_ACCOUNT_NUMBER++;
		this.client = client;
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public void withdraw(double value) {
		amount -= value;
	}

	@Override
	public void deposit(double value) {
		amount += value;
	}

	@Override
	public void transfer(double value, AccountInterface destinationAccount) {
		this.withdraw(value);
		destinationAccount.deposit(value);
	}

	protected void printInfo() {
		System.out.printf("%s%s %s%n%s%d%n%s%d%n%s%.2f%n",
			"Client: ", this.client.getFirstName(), this.client.getLastName(),
			"Agency: ", this.getAgency(),
			"Number: ", this.number,
			"Amount: ", this.amount);
	}
}
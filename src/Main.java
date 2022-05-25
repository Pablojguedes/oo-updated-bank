public class Main {
	public static void main(String[] args) {

		Client client1 = new Client("Pablo", "Guedes", "111.222.333-44",
			"995651288");
		
		Account checkingAccount = new CheckingAccount(client1);
		Account poupanca = new SavingsAccount(client1);

		checkingAccount.deposit(100);
		checkingAccount.printExtract();

		checkingAccount.transfer(100, poupanca);
		checkingAccount.printExtract();
	}

}
public class Main {
	public static void main(String[] args) {

		Client client1 = new Client("Pablo", "Guedes", "111.222.333-44",
			"995651288");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
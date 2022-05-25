public class ContaCorrente extends Conta {

	public ContaCorrente(Client client) {
		super(client);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
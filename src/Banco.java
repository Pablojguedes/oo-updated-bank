import java.util.List;

public class Banco {

    private String nome;
    private List<Account> accounts;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Account> getContas() {
        return accounts;
    }

    public void setContas(List<Account> accounts) {
        this.accounts = accounts;
    }

}
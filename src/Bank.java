import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account accountToAdd){
        accounts.add(accountToAdd);
    }

    public void removeAccountByIndex(int index){
        accounts.remove(index);
    }
}
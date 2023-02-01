package entities;
public class BankAccount {
    private String name;
    private String adress;
    private String account_type;
    private Double balance;

    private int id = 1000;
    private int n_transactions;

    public BankAccount(int id, String name, String adress, String account_type, Double balance ) {
        this.name = name;
        this.adress = adress;
        this.account_type = account_type;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getN_transactions() {
        return n_transactions;
    }

    public void setN_transactions(int n_transactions) {
        this.n_transactions = n_transactions;
    }


    public double withdraw(double mount){
      return  balance -= mount;
      //se nao funcionar com return, fazer vazio sem retorno
    }

    public double deposit(double mount){
        return
                 balance += mount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ID=BA" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", account_type='" + account_type + '\'' +
                ", balance=" + balance +
                '}';
    }
}

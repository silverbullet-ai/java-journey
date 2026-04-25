class BankAccount {
    private String name;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}

public class Practice {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setName("Aahish");
        acc.deposit(1000);
        acc.deposit(500);

        System.out.println("Name: " + acc.getName());
        System.out.println("Balance: " + acc.getBalance());
    }
}
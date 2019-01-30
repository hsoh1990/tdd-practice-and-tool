package chapter01;

public class Account {
    private Integer balance;

    public Account(Integer money) {
        this.balance = money;
    }

    public Integer getBalance() {
        return balance;
    }

    public void deposit(Integer money) {
        this.balance += money;
    }

    public void withdraw(Integer money) {
        this.balance -= money;
    }
}

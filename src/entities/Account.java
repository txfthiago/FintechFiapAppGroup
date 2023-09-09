package entities;

import java.util.List;

public class Account {
    private int id;
    private String name;
    private double balance;
    private List<Transaction> extract;

    public Account(int id, String name, double balance, List<Transaction> extract) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.extract = extract;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getExtract() {
        return extract;
    }

    public void setExtract(List<Transaction> transactions) {
        this.extract = extract;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", extract=" + extract +
                '}';
    }
}

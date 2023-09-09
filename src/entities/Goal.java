package entities;

import java.time.LocalDate;

public class Goal {
    private int id;
    private double target;
    private String description;
    private LocalDate date;
    private double balance;

    public Goal(int id, double target, String description, LocalDate date, double balance) {
        this.id = id;
        this.target = target;
        this.description = description;
        this.date = date;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public LocalDate getDate() {
        return date;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "id=" + id +
                ", target=" + target +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", balance=" + balance +
                '}';
    }
}

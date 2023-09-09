package entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {
    private int id;
    private double amount;
    private SenderType sender;
    private LocalDateTime dateTime;
    private String description;
    private Category category;

    public Transaction(int id, double amount, SenderType sender, LocalDateTime dateTime, String description, Category category) {
        this.id = id;
        this.amount = amount;
        this.sender = sender;
        this.dateTime = dateTime;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public SenderType getSender() {
        return sender;
    }

    public void setSender(SenderType sender) {
        this.sender = sender;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "\n  id=" + id +
                "\n  amount=" + amount +
                "\n  sender=" + sender +
                "\n  dateTime=" + dateTime +
                "\n  description='" + description + '\'' +
                "\n  category=" + category +
                "\n}";
    }

}

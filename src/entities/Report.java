package entities;

import java.util.List;

public class Report {
    private int id;
    private String conclusion;
    private List<Transaction> transactions;

    public Report(int id, String conclusion, List<Transaction> transactions) {
        this.id = id;
        this.conclusion = conclusion;
        this.transactions = transactions;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion() {
        this.conclusion = conclusion;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions() {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", conclusion='" + conclusion + '\'' +
                ", transactions=" + transactions +
                '}';
    }

}

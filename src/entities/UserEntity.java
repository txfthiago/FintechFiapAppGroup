package entities;

import java.util.List;

public class UserEntity {
    private int id;
    private String name;
    private Boolean legalPerson;
    private String email;
    private String passWord;
    private List<Account> accounts;
    private List<Goal> goals;
    private List<Report> reports;

    public UserEntity(int id, String name, Boolean legalPerson, String email, String passWord, List<Account> accounts, List<Goal> goals, List<Report> reports) {
        this.id = id;
        this.name = name;
        this.legalPerson = legalPerson;
        this.email = email;
        this.passWord = passWord;
        this.accounts = accounts;
        this.goals = goals;
        this.reports = reports;
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

    public Boolean isLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(Boolean legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports() {
        this.reports = reports;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "\n  id=" + id +
                "\n  name='" + name + '\'' +
                "\n  email='" + email + '\'' +
                "\n  password='" + passWord + '\'' +
                "\n  Accounts=" + accounts +
                "\n  Goals=" + goals +
                "\n}";
    }
}

package entities;

import java.util.List;

public class PhysicalPerson extends UserEntity {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf() {
        this.cpf = cpf;
    }

    public PhysicalPerson(int id, String name, Boolean legalPerson, String email, String passWord, List<Account> accounts, List<Goal> goals, List<Report> reports, String cpf) {
        super(id, name, legalPerson, email, passWord, accounts, goals, reports);
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "PhysicalPerson{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", legalPerson=" + isLegalPerson() +
                ", email='" + getEmail() + '\'' +
                ", passWord='" + getPassWord() + '\'' +
                ", accounts=" + getAccounts() +
                ", goals=" + getGoals() +
                ", reports=" + getReports() +
                ", cpf='" + cpf + '\'' +
                '}';
    }

}

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
        return "\nLegalPerson{" +
                "\n  id=" + getId() +
                "\n  name='" + getName() + '\'' +
                "\n  legalPerson=" + isLegalPerson() +
                "\n  email='" + getEmail() + '\'' +
                "\n  passWord='" + getPassWord() + '\'' +
                "\n  accounts=" + getAccounts() +
                "\n  goals=" + getGoals() +
                "\n  cpf='" + cpf + '\'' +
                "\n}";
    }

}

package entities;

import java.util.List;

public class LegalPerson extends UserEntity {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj() {
        this.cnpj = cnpj;
    }

    public LegalPerson(int id, String name, Boolean legalPerson, String email, String passWord, List<Account> accounts, List<Goal> goals, List<Report> reports, String cnpj) {
        super(id, name, legalPerson, email, passWord, accounts, goals, reports);
        this.cnpj = cnpj;
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
                "\n  cnpj='" + cnpj + '\'' +
                "\n}";
    }
}

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
        return "LegalPerson{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", legalPerson=" + isLegalPerson() +
                ", email='" + getEmail() + '\'' +
                ", passWord='" + getPassWord() + '\'' +
                ", accounts=" + getAccounts() +
                ", goals=" + getGoals() +
                ", reports=" + getReports() +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}

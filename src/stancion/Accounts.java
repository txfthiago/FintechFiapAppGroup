package stancion;

import entities.Account;

import java.util.ArrayList;
import java.util.List;

public class Accounts {

    public static List<Account> createAccounts() {
        var account1 = new Account(1, "Santander", 3000, Transactions.transactions());
        var account2 = new Account(2, "Bradesco", 1000, Transactions.transactions());

        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);

        return accountList;
    }
}

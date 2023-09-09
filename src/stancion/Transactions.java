package stancion;

import entities.Category;
import entities.SenderType;
import entities.Transaction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transactions {

    public static List<Transaction> transactions() {
        var category1 = new Category(1, "Gastos do remedio", "despesa");
        var category2 = new Category(2, "Prestação de serviço", "receita");
        var transaction1 = new Transaction(1, 200.00, SenderType.USER, LocalDateTime.now(), "Dinheiro do remedio", category1);
        var transaction2 = new Transaction(2, 300.00, SenderType.OTHER, LocalDateTime.now(), "Prestação de servico", category2);

        List<Transaction> transactionsList = new ArrayList<Transaction>();
        transactionsList.add(transaction1);
        transactionsList.add(transaction2);

        return transactionsList;


    }
}

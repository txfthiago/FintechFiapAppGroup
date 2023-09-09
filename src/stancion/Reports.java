package stancion;

import entities.Report;

import java.util.ArrayList;
import java.util.List;

public class Reports {
    public static List<Report> createReport() {
        var report = new Report(1, "O maior gasto do usuario foi em ifood", Transactions.transactions());

        List<Report> listReports = new ArrayList<>();
        listReports.add(report);
        return listReports;
    }
}

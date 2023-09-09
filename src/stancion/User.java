package stancion;

import entities.*;

public class User {

    public static LegalPerson createLegalPerson() {
        var legalPerson = new LegalPerson(
                1,
                "AlugCar",
                false,
                "admin@alugcar.com",
                "senha123",
                Accounts.createAccounts(),
                Goals.creteGoals(),
                Reports.createReport(),
                "12.345.678/0009-10"
        );

        return legalPerson;
    }

    public static PhysicalPerson createPhysicalPerson() {
        var physicalPerson = new PhysicalPerson(
                1,
                "AlugCar",
                false,
                "admin@alugcar.com",
                "senha123",
                Accounts.createAccounts(),
                Goals.creteGoals(),
                Reports.createReport(),
                "123.456.789.10"
        );

        return physicalPerson;

    }

}

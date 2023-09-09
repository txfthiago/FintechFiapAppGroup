import entities.Account;
import entities.Goal;
import entities.Transaction;
import entities.UserEntity;
import stancion.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var physicalPerson = User.createPhysicalPerson();

        var legalPerson = User.createLegalPerson();

        System.out.println(legalPerson);

        System.out.println(physicalPerson);

    }
}
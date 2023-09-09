package stancion;

import entities.Goal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Goals {
    public static List<Goal> creteGoals() {
        var goal1 = new Goal(1, 50000, "Comprar um carro", LocalDate.of(2025, 12, 2), 10000);
        var goal2 = new Goal(2, 1000000, "Comprar uma casa", LocalDate.of(2026, 12, 2), 200000);

        List<Goal> goalsList = new ArrayList<>();
        goalsList.add(goal1);
        goalsList.add(goal2);

        return goalsList;
    }
}

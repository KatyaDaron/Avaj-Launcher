import java.util.ArrayList;

public class Tower {

    ArrayList<Flyable> fly = new ArrayList<>();

    void register(Flyable flyable) {
        fly.add(flyable);
        System.out.println("Tower says: " + flyable + "#" + flyable.getAircraftName() + "(" + flyable.getAircraftId() + ") registered to weather tower.");
    }

    void unregister(Flyable flyable) {
        System.out.println("Tower says: " + flyable + "#" + flyable.getAircraftName() + "(" + flyable.getAircraftId() + ") unregistered from weather tower.");
        fly.remove(flyable);
    }

    protected void conditionsChanged() {
        for (Flyable fl : fly) {
            fl.updateConditions();
        }
    }
}

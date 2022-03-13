import java.util.ArrayList;

public class Tower {

    private ArrayList<Flyable> observers = new ArrayList<>();
    private ArrayList<Flyable> found = new ArrayList<>();

    public void register(Flyable flyable) {
        observers.add(flyable);
        System.out.println("Tower says: " + flyable.getAircraftName() + " registered to weather tower.");
    }

    public void unregister(Flyable flyable) {
        System.out.println(flyable.getAircraftName() + " landing.");
        System.out.println("Tower says: " + flyable.getAircraftName() + " unregistered from weather tower.");
        found.add(flyable);
    }

    protected void conditionsChanged() {
        for (int i = 0; i < observers.size(); i++) {
           observers.get(i).updateConditions();
        }
        observers.removeAll(found);
    }
}

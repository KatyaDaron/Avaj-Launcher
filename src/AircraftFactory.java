import java.util.Locale;

public class AircraftFactory {

    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) throws MyException {

        Coordinates coordinates = new Coordinates(longitude, latitude, height);

        if (type.equalsIgnoreCase("Helicopter")) {
            return new Helicopter(name, coordinates);
        } else if (type.equalsIgnoreCase("JetPlane")) {
            return new JetPlane(name, coordinates);
        } else if (type.equalsIgnoreCase("Baloon")) {
            return new Baloon(name, coordinates);
        }
        throw new MyException("FAILED ATTEMPT: invalid flyable \"" + type.toUpperCase(Locale.ROOT) + "\" tried registering to Tower.");
    }
}

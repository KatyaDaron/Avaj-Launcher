public class Aircraft {

    protected long id;
    protected static String name;
    private long idCounter;
    protected static Coordinates coordinates;


    public Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public static String getName() {
        return name;
    }

    public static Coordinates getCoordinates() {
        return coordinates;
    }

    private long nextId() {
        idCounter++;
        return idCounter;
    }
}

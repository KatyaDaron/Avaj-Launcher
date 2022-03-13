public class Aircraft {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
        this.id = nextId();
    }

    private long nextId() {
        idCounter++;
        return idCounter;
    }

    protected void logMessage(String info) {
        System.out.println(getAircraftName() + ": " + info);
    }

    public String getAircraftName() {
        return this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + ")";
    }
}

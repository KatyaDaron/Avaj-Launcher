public class Baloon extends Aircraft implements Flyable {

    WeatherTower weatherTower = new WeatherTower();

    public Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {

        //SUN - Longitude increases with 2, Height increases with 4
        //RAIN - Height decreases with 5
        //FOG - Height decreases with 3
        //SNOW - Height decreases with 15
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }

    @Override
    public String getAircraftName() {
        return name;
    }

    @Override
    public Long getAircraftId() {
        return id;
    }
}

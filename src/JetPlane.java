public class JetPlane extends Aircraft implements Flyable {

    WeatherTower weatherTower = new WeatherTower();

    public JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
//SUN - Latitude increases with 10, Height increases with 2
//RAIN - Latitude increases with 5
//FOG - Latitude increases with 1
//SNOW - Height decreases with 7
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

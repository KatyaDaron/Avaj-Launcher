public class Helicopter extends Aircraft implements Flyable {

    WeatherTower weatherTower = new WeatherTower();

    public Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
//SUN - Longitude increases with 10, Height increases with 2
//RAIN - Longitude increases with 5
//FOG - Longitude increases with 1
//SNOW - Height decreases with 12
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

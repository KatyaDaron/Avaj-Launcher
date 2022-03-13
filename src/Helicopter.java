public class Helicopter extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    protected Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        String message = new String();

        if (weather.equalsIgnoreCase("SUN")) {
            coordinates.changeLongitude(10);
            coordinates.changeHeight(2);
            message = "This is hot.";
        } else if (weather.equalsIgnoreCase("RAIN")) {
            coordinates.changeLongitude(5);
            message = "It's raining cats and dogs!!!";
        } else if (weather.equalsIgnoreCase("FOG")) {
            coordinates.changeLongitude(1);
            message = "Uh-oh...I see a lot of fog.";
        } else if (weather.equalsIgnoreCase("SNOW")) {
            coordinates.changeHeight(-12);
            message = "My motor is going to freeze!";
        }
        this.logMessage(message);
        if (coordinates.getHeight() == 0) {
            weatherTower.unregister(this);
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
    }
}
public class JetPlane extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    protected JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        String message = new String();

        if (weather.equalsIgnoreCase("SUN")) {
            coordinates.changeLatitude(10);
            coordinates.changeHeight(2);
            message = "Today will be amazing, my sunshines!";

        } else if (weather.equalsIgnoreCase("RAIN")) {
            coordinates.changeLatitude(5);
            message = "It's raining. Better watch out for lightnings.";
        } else if (weather.equalsIgnoreCase("FOG")) {
            coordinates.changeLatitude(1);
            message = "This is one foggy morning...";
        } else if (weather.equalsIgnoreCase("SNOW")) {
            coordinates.changeHeight(-7);
            message = "OMG! Winter is coming!";
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

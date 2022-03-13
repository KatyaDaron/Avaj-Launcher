public class Baloon extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    protected Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        String message = new String();

        if (weather.equalsIgnoreCase("SUN")) {
            coordinates.changeLongitude(2);
            coordinates.changeHeight(4);
            message = "Let's enjoy the good weather and take some pics.";
        } else if (weather.equalsIgnoreCase("RAIN")) {
            coordinates.changeHeight(-5);
            message = "Damn you rain! You messed up my baloon.";
        } else if (weather.equalsIgnoreCase("FOG")) {
            coordinates.changeHeight(-3);
            message = "Where did the fog come from?";
        } else if (weather.equalsIgnoreCase("SNOW")) {
            coordinates.changeHeight(-15);
            message = "It's snowing. We're gonna crash.";
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

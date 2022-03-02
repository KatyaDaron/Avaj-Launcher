public class WeatherTower extends Tower {

    @Override
    void register(Flyable flyable) {
        super.register(flyable);
    }

    @Override
    void unregister(Flyable flyable) {
        super.unregister(flyable);
    }

    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    private void changeWeather() {
        conditionsChanged();
    }
}

public interface Flyable {

    void updateConditions();

    void registerTower(WeatherTower weatherTower);

    String getAircraftName();

    Long getAircraftId();

}

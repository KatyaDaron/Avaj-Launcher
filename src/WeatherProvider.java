import java.util.Random;

public class WeatherProvider {

    private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
    private static WeatherProvider provider = new WeatherProvider();

    private WeatherProvider() {
    }

    public static WeatherProvider getProvider() {
        return provider;
    }

    public String getCurrentWeather(Coordinates coordinates) {

        Random num = new Random();
        int random = num.nextInt(109621);
        int i = (coordinates.getHeight() + coordinates.getLatitude() + coordinates.getLongitude() + random) % 4;
        return weather[i];
    }
}

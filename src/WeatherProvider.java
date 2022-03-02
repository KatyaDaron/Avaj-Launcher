import java.util.Random;

public class WeatherProvider {

    private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
    private static WeatherProvider provider = new WeatherProvider();

    public WeatherProvider() {  }

    public static WeatherProvider getProvider() {
        return provider;
    }

    public String getCurrentWeather(Coordinates coordinates) {

        Random num = new Random();
        int random = num.nextInt();
        int index = (coordinates.getHeight() + coordinates.getLatitude() + coordinates.getLongitude() + random) % 4;
        for (int i = 0; i < weather.length; i++) {
            if (index == i) {
                return weather[i];
            }
        }
        return null;
    }
}

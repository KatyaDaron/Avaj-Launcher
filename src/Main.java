import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        WeatherTower weatherTower = new WeatherTower();
        int s = 1;
        int n = 0;

        Scanner scanner = new Scanner(new File("scenario.txt"));
        PrintStream output = new PrintStream(new FileOutputStream("simulation.txt"));
            System.setOut(output);


        while (scanner.hasNextLine()) {
            if (s == 1) {
                n = Integer.parseInt(scanner.nextLine());
                s++;
            }
            String[] arguments = scanner.nextLine().split(" ");
            Flyable flyable = AircraftFactory.newAircraft(arguments[0], arguments[1], Integer.parseInt(arguments[2]), Integer.parseInt(arguments[3]), Integer.parseInt(arguments[4]));
            flyable.registerTower(weatherTower);
        }

        while (n-- != 0) {
            weatherTower.changeWeather();
        }
    }
}

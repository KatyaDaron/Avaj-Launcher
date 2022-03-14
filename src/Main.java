import java.io.*;
import java.util.Scanner;

public class Main {
    WeatherTower weatherTower = new WeatherTower();
    Scanner scanner;
    int s = 1;
    int n = 0;

    private void newStream() {
        try {
            scanner = new Scanner(new File("scenario.txt"));
            PrintStream output = new PrintStream(new FileOutputStream("simulation.txt"));
            System.setOut(output);
        } catch (FileNotFoundException e) {
            System.err.println("Incorrect file name.");
        }
    }

    private void parseFile() {

        while (scanner.hasNextLine()) {
            if (s == 1) {
                n = Integer.parseInt(scanner.nextLine());
                s++;
            }
            String[] arguments = scanner.nextLine().split(" ");
            try {
                Flyable flyable = AircraftFactory.newAircraft(arguments[0], arguments[1], Integer.parseInt(arguments[2]), Integer.parseInt(arguments[3]), Integer.parseInt(arguments[4]));
                flyable.registerTower(weatherTower);
            } catch (MyException e) {
                e.errMessage();
            }
        }
    }

    private void launchSimulation() {
        while (n-- != 0) {
            weatherTower.changeWeather();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.newStream();
        m.parseFile();
        m.launchSimulation();
    }
}

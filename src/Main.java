import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("scenario.txt");
        Scanner scanner = new Scanner(file);
        int s = 1;
        int n = 0;

        while (scanner.hasNextLine()) {
            if (s == 1) {
                n = Integer.parseInt(scanner.nextLine());
                s++;
            }
            String[] arguments = scanner.nextLine().split(" ");
            Flyable flyable = AircraftFactory.newAircraft(arguments[0], arguments[1], Integer.parseInt(arguments[2]), Integer.parseInt(arguments[3]), Integer.parseInt(arguments[4]));
        }
    }
}

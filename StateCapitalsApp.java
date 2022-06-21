import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitalsApp {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Capital> stateCapital = new HashMap<>();

        Scanner sc = new Scanner(
                new BufferedReader(new FileReader("MoreStateCapitals.txt")));

        System.out.println("50 STATE/CAPITAL PAIRS LOADED.\n" +
                "==============================");

        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] keyValues = str.split("::");
            String name = keyValues[1];
            float population = Float.parseFloat(keyValues[2]);
            float squareMileage = Float.parseFloat(keyValues[3]);

            stateCapital.put(keyValues[0], new Capital(name, population, squareMileage));
        }
        System.out.println(stateCapital.keySet());





    }
}




import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
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
            // store value into an array
            stateCapital.put(keyValues[0], new Capital(name, population, squareMileage));
        }
        System.out.println(stateCapital.values());



        /*
            Solving remaining TWO questions

        Scanner userSc = new Scanner(System.in);

        // Q1 LISTING CAPITALS WITH POPULATIONS GREATER THAN user input
        System.out.println("Please enter the lower limit for capital city population: ");

        System.out.println();
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN '100':");
        System.out.println();


        // Q2 LISTING CAPITALS WITH AREAS LESS THAN user input:
        System.out.println("Please enter the upper limit for capital city sq mileage:");

        System.out.println();
        System.out.println("LISTING CAPITALS WITH AREAS LESS THAN 150:");
        */

    }
}




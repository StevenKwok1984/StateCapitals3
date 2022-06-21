import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

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
            // create capital that store data of capital
            Capital capital = new Capital(
                    keyValues[1],
                    Float.parseFloat(keyValues[2]),
                    Float.parseFloat(keyValues[3]));
            // store value into an array
            stateCapital.put(keyValues[0], capital);
        }

        // print out the entire table
        printResult(stateCapital);


        /*
           Solving remaining TWO questions
        */

        // Q1 LISTING CAPITALS WITH POPULATIONS GREATER THAN user input
        float greaterThanPop = readValue("Please enter the lower limit for capital city population: ");
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN '"+ greaterThanPop + "':");
        Map<String, Capital> popFilteredSates = getPopLimitedStates(stateCapital, greaterThanPop);
        // get Keys
        printResult(popFilteredSates);


        // Q2 LISTING CAPITALS WITH AREAS LESS THAN user input:

        float smallerThanSM = readValue("Please enter the upper limit for capital city sq mileage:");
        System.out.println("LISTING CAPITALS WITH AREAS LESS THAN " + smallerThanSM + ":");
        Map<String, Capital> smFilteredSates = getSmLimitedStates(stateCapital, greaterThanPop);
        // print result
        printResult(smFilteredSates);




    }

    public static float readValue(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        float maxNum = scanner.nextFloat();
        System.out.println();
        return maxNum;
    }

    public static void printResult(Map<String, Capital> stateMap) {
        Set<String> keys = stateMap.keySet();

        for (String k : keys) {
            System.out.println(k + " - " + stateMap.get(k).toString());
        }
        System.out.println();
    }

    public static Map<String, Capital> getPopLimitedStates(Map<String, Capital>stateMap, float limit) {
        Map<String, Capital> filteredStates = new HashMap<>();

        stateMap.forEach((key, value) -> {
            if (value.getPopulation() > limit) {
                filteredStates.put(key, value);
            }
        });
        return filteredStates;
    }

    public static Map<String, Capital> getSmLimitedStates(Map<String, Capital>stateMap, float limit) {
        Map<String, Capital> filteredStates = new HashMap<>();

        stateMap.forEach((key, value) -> {
            if (value.getSquareMileage() < limit) {
                filteredStates.put(key, value);
            }
        });
        return filteredStates;
    }
}




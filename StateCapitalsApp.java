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

        while(sc.hasNextLine()){
            String str = sc.nextLine();
            String[] keyValuePair = str.split("::");
            stateCapital.put(keyValuePair[0], keyValuePair[1]);
        }
    }
}

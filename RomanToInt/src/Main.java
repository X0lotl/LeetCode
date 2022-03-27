import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Character, Integer> romanToInt = new HashMap<>();

    public static void initHashMap() {
        romanToInt.put('I',1);
        romanToInt.put('V',5);
        romanToInt.put('X',10);
        romanToInt.put('L',50);
        romanToInt.put('C',100);
        romanToInt.put('D',500);
        romanToInt.put('M',1000);
    }

    public static int getOutput(char[] input) {
        int output = 0;
        int oldInt = 0;
        for(char s : input) {
            int newInt = romanToInt.get(s);
            if (newInt > oldInt) {
                output += newInt - (2 * oldInt);
            } else {
            output += romanToInt.get(s);
            }
            oldInt = newInt;
        }

        return output;
    }


    public static void main(String[] args) {
        initHashMap();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(getOutput(s.toCharArray()));
    }
}

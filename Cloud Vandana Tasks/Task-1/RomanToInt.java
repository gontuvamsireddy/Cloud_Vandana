import java.util.HashMap;
import java.util.Scanner;

// Class to convert a Roman numeral to an integer
class RomanToInt {
    // Method to convert a Roman numeral string to an integer
    public static int romanToInt(String s) {
        // Convert the input string to uppercase for case-insensitivity
        s = s.toUpperCase();

        // Create a HashMap to store the mapping of Roman numerals to integers
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = map.get(s.charAt(i));

            if (currentValue >= prevValue) {
                res += currentValue;
            } else {
                res -= currentValue;
            }

            prevValue = currentValue;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = romanToInt(s);
        System.out.println(res);
        sc.close();
    }
}

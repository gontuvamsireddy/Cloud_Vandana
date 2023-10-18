import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

    // Function to check if a given string is a pangram
    public static boolean isPangram(String s) {

        // Convert the string to lowercase for case-insensitive comparison
        s = s.toLowerCase();
        // Set to store unique characters in the string
        Set<Character> uniqueChar = new HashSet<>();

        // Iterate through each character in the string
        for (Character ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                uniqueChar.add(ch);
            }
        }

        // Return true if the set contains all 26 letters of the alphabet
        return uniqueChar.size() == 26;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = isPangram(s);

        // Print the result (True or False) to the console
        System.out.println((res) ? "True" : "False");
        sc.close();
    }

}

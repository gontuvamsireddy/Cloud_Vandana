import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrayshuffle {
    public static int[] shuffleArray(int[] arr) {

        // Create a copy of the input array to avoid modifying the original
        int[] shuffledArray = Arrays.copyOf(arr, arr.length);
        Random random = new Random();

        for (int i = shuffledArray.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = random.nextInt(i + 1);

            // Swap the elements at indices i and j
            int temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[j];
            shuffledArray[j] = temp;
        }

        return shuffledArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Created Scanner object;
        int n = sc.nextInt(); // Take input from the user;
        int[] ar = new int[n]; // Creating an Array of Fixed size
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        int[] shuffledArray = shuffleArray(ar);

        for (int i = 0; i < shuffledArray.length; i++) {
            System.out.print(shuffledArray[i] + " "); // Printing an Array
        }

    }
}

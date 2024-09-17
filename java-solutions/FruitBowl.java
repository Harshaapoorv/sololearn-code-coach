import java.util.Scanner;

public class FruitBowl {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int number_of_fruits = in.nextInt(); // Number of fruit pieces in the bowl

        // As the number of fruits is even and half of them are apples and the other half are bananas

        int number_of_apples = number_of_fruits / 2;

        // Now for each pie we have three apples
        System.out.println(number_of_apples / 3);

        in.close();
    }
}
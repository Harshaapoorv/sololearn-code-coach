import java.util.Scanner;
import java.lang.Math;

public class HalloweenCandy {
    public static void main (String[] args) {

//  This problem is a classic case of probability
//  Let's consider 4 houses out of which 1 would be candy, 2 would be dollar bills 
//  and 1 would be toothbrush

//  So the probability of dollar bills is 2 in 4 (number_of_houses)


        Scanner in = new Scanner(System.in);

        int number_of_houses = in.nextInt();
        Double val = 2.0 / number_of_houses;
        int a = (int)(Math.ceil(val * 100));

        System.out.println(a);

        in.close();
    }
}

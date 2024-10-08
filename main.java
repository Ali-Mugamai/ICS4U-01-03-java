/*
* This program gets the type of food and number of food,
* calculates and display the time to reheat in the microwave.
*
* @author  Ali Mugamai
* @version 1.0
* @since   2024-10-03
*/
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
* This is the standard cooked time  program.
*/
public final class Microwave {
    static final float PIZZA_TIME = 0.75f;
    static final float SUB_TIME = 1.0f;
    static final float SOUP_TIME = 1.75f;
    static final int MAX_FOOD = 3;
    static final int MIN_IN_SEC = 60;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    * @throws IllegalStateException
    */
    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final List<String> foodTypesList = Arrays.asList("PIZZA", "SUB", "SOUP");
        float individualTime = 0f;

        // String input
        System.out.print("Are you heating  a sub, pizza, or soup? ");
        final String foodType = myObj.nextLine();

        // Check user's food is sub, pizza or soup
        if (foodTypesList.contains(foodType.toUpperCase())) {

            if (foodTypesList.indexOf(foodType.toUpperCase()) == 0) {
                individualTime = PIZZA_TIME;
            }
            else if (foodTypesList.indexOf(foodType.toUpperCase()) == 1) {
                individualTime = SUB_TIME;
            }
            else {
                individualTime = SOUP_TIME;
            }

            System.out.print("How many " + foodType + "(s) are you cooking? (max:3): ");
            try {
                final int foodNumber = Integer.parseInt(myObj.nextLine());

                if (foodNumber > 0 && foodNumber <= MAX_FOOD) {
                    // Process
                    final float cookTime = (individualTime / foodNumber)
                                       * (float) Math.pow(MAX_FOOD, foodNumber - 1);

                    // convert float minutes to minutes and seconds
                    final int cookTimeMin = (int) Math.floor(cookTime);
                    final float cookTimeSec = (cookTime - cookTimeMin) * MIN_IN_SEC;

                    // Output
                    System.out.println("The total cook time is " + cookTimeMin
                                       + " minutes " + cookTimeSec + " seconds.");
                }
                else {
                    System.out.println("Maximum quantity of food is 3.");
                }
            }
            catch (java.util.InputMismatchException errorCode) {
                System.err.println("Invalid input.");
            }
        }
        else {
            System.out.println("There is no food for the given type.");
        }
        System.out.println("\nDone.");
    }
}
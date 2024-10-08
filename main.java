/*
* this program calculates the energy an object can produce in joules
*
* @author  Ali Mugamai
* @version 1.0
* @since   2021-09-24
*/
import java.util.Scanner;
/**
* This is a program that blanks.
*/
final class Main {
    /**
    * Speed of light.
    */
    private static final double LIGHTSPEED = 299800000;
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        double objectmass = 0.0;
        double energyProduced = 0.0;
        Scanner myInput = new Scanner(System.in);  //define instance of Scanner
        System.out.print("Enter the mass of the object (kg) : ");
        try {
            ObjectMass = myInput.nextDouble(); //get input from the user
            energyProduced = objectmass * LIGHTSPEED * LIGHTSPEED;
            System.out.println("An object with a mass of " + objectmass
              + "would produce " + energyProduced + " J of Energy");
        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("not a number");
        }

      System.out.println("\nDone.");
    }
}

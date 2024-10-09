import java.util.Scanner;

public class main {
        public static void main(String[] args) {{
        // Constants
        final int SUB_TIME = 60;
        final int PIZZA_TIME = 45;
        final int SOUP_TIME = 105;
        int totalTime = 0;
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you heating sub, pizza, or soup? (lowercase): ");
        String choiceString = scanner.nextLine().trim();
        System.out.print("How many are you heating? (Max 3): ");
        String amountInput = scanner.nextLine();
        int amountInt;
        try {
            amountInt = Integer.parseInt(amountInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }
        if (amountInt < 0 || amountInt > 3) {
            System.out.println("Invalid input.");
        } else { 
            // Process
            switch (choiceString) {
                case "sub":
                    totalTime = (SUB_TIME * amountInt);
                    break;
                case "pizza":
                    totalTime = (PIZZA_TIME * amountInt);
                    break;
                case "soup":
                    totalTime = (SOUP_TIME  * amountInt);
                    break;
                default:
                    System.out.println("Invalid input.");
                    return;
            }

            int cookTimeS = totalTime % 60;
            int cookTimeM = totalTime / 60;
            System.out.printf("Total cook time for %s is:\n%d minutes and %d seconds.\n", choiceString, cookTimeM, cookTimeS);
        }

        System.out.println("\nDone.");
        scanner.close();
    }
}
}

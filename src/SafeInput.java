import java.util.Scanner;

public class SafeInput {
    private static final Scanner in = new Scanner(System.in);

    public static int getRangedInt(String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;

        do {
            System.out.print(prompt);
            if (in.hasNextInt()) {
                retVal = in.nextInt();
                in.nextLine(); // clear end of line
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.printf("Input must be between %d and %d inclusive.%n", low, high);
                }
            } else {
                String trash = in.nextLine(); // clear bad input
                System.out.printf("You must enter an integer (you typed: %s).%n", trash);
            }
        } while (!done);

        return retVal;
    }


}
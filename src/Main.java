
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        // PSEUDO CODE (outline as single-line comments)
        // Declare variables: month, trash
        // Prompt user to enter birth month (1-12)
        // If input is a valid int:
        //      Read month
        //      Clear scanner buffer
        //      If month is between 1 and 12 inclusive:
        //          Output "Your birth month is: N"
        //      Else:
        //          Output error "You entered an incorrect month value: N"
        // Else:
        //      Read bad input as trash string
        //      Output error message and stop
        Scanner in = new Scanner(System.in);

        int month = 0;
        String trash = "";

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // clear buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }

        } else {
            trash = in.nextLine(); // read bad input safely
            System.out.println("\nYou entered: " + trash);
            System.out.println("Run the program again and enter a whole number from 1 to 12!");
        }
    }
}
import java.util.Scanner;

public class FloatingPointStats {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // variables needed for running total, max value, min value, count of inputs, and limit of iterations
        double sum = 0.0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int count = 0;
        final int MAX_VALUES = 5;
        int attempts = 0;
        final int MAX_TRIES = 3;
        
        System.out.println("Enter five floating-point values.");
        // loop to run until MAX_VALUES is reached
        while (count < MAX_VALUES) {
            System.out.printf("Enter value %d of %d: ", count + 1, MAX_VALUES);
            String input = scnr.nextLine().trim();
            // input validation, 3 attempts per prompt, reset attempts on correct entry
            try {
                double value = Double.parseDouble(input);
                sum += value;
                if (value > max) max = value;
                if (value < min) min = value;
                count++;
                attempts = 0;
            } catch (NumberFormatException e) {
            	// increment attempts and provide offramp @ MAX_TRIES before return message
            	attempts ++;
                if (attempts == MAX_TRIES) {
                	System.out.println("Too many failed inputs. Closing Program.");
                	System.exit(0);
                }
            	System.out.println("Invalid entry. Please enter a valid number.");
            }

        }
        
        double average = sum / MAX_VALUES;
        double interest = sum * 0.20;
        
        System.out.printf("\nTotal: $%.2f\n", sum);
        System.out.printf("Average: $%.2f\n", average);
        System.out.printf("Maximum: $%.2f\n", max);
        System.out.printf("Minimum: $%.2f\n", min);
        System.out.printf("Interest on total at 20%%: $%.2f\n", interest);
        
        scnr.close();
    }
}

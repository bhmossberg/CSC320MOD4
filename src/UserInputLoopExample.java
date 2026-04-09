import java.util.Scanner;

public class UserInputLoopExample {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input;

      System.out.println("Welcome to the Word Analyzer");
      System.out.println("Type 'quit' at any time to exit.\n");

      // Outer while(true) loop - runs until user chooses to quit
      while (true) {
         
         System.out.print("Enter a word: ");
         input = sc.next();

         // Off-ramp: user chooses to quit
         if (input.equals("quit")) {
            break;
         }

         // Inner for loop - known number of iterations (one per character)
         System.out.println("Analyzing '" + input + "':");
         for (int i = 0; i < input.length(); ++i) {
            char ch = input.charAt(i);
            System.out.println("  Position " + (i+1) + ": " + ch);
         }

         System.out.println("--- Word analysis complete ---\n");
      }

      System.out.println("Program ended. Goodbye!");
      sc.close();
   }
}
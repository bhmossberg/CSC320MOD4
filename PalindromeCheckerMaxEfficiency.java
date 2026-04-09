import java.util.Scanner;

public class PalindromeCheckerMaxEfficiency {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String userInput = sc.nextLine().strip();
      String noSpaces = userInput.replace(" ", "");
      
      // Reverse the string without spaces
      String reverse = new StringBuilder(noSpaces).reverse().toString();
      
      if (noSpaces.equalsIgnoreCase(reverse)) {
         System.out.println(userInput + " is a palindrome");
      } else {
         System.out.println(userInput + " is not a palindrome");
      }
      
      sc.close();
   }
}
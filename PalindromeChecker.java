import java.util.Scanner;

public class PalindromeChecker {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String userInput = sc.nextLine().strip();
      String noSpaces = "";
      String reverse = "";
      for (int i = 0; i < userInput.length(); ++i){
         if (userInput.charAt(i) == ' '){
            continue;
         }
         noSpaces += userInput.charAt(i);
      }
      for (int i = noSpaces.length() - 1 ; i >= 0; --i){

         reverse += noSpaces.charAt(i);
      }
      //System.out.println(noSpaces);      
      //System.out.println(reverse);
      if (noSpaces.equals(reverse)){
         System.out.println(userInput + " is a palindrome");
      } else {
         System.out.println(userInput + " is not a palindrome");    
      }
      sc.close();
      
   }
}

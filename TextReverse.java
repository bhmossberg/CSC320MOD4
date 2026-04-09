import java.util.Scanner;

public class TextReverse {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String userInput = sc.nextLine().strip();
      
      while ((!userInput.equals("quit")) && (!userInput.equals("Quit")) && (!userInput.equals("q"))) {
         //System.out.print("ok");
         String reverse = "";
         for (int i = userInput.length() - 1 ; i >= 0; --i){
            reverse += userInput.charAt(i);
         }
         System.out.println(reverse);
         userInput = sc.nextLine().strip();
      }
   }
}

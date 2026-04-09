import java.util.Scanner;

public class SpaceRemover {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String userInput;
      String outputString = "";
      char nextChar;
      userInput = sc.nextLine();
      for (int i = 0; i < userInput.length(); ++i){
         nextChar = userInput.charAt(i);
         if (nextChar == ' '){
            continue;
         }
         else {
            outputString += nextChar;
         }
      }
      System.out.println(outputString);
      sc.close();
   }
}

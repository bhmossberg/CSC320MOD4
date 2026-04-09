import java.util.Scanner; 

public class CharacterChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
      char nextChar;

      userString = scnr.next();
      for (int i = 0; i < userString.length(); ++i){
         nextChar = userString.charAt(i);
         if ((Character.isDigit(nextChar) == true) && (i != (userString.length() - 1))){
            continue;
         }
         else if ((Character.isDigit(nextChar) == true) && (i == (userString.length() - 1))){
            System.out.println ("yes");
         }
         else {
            System.out.println("no");
            break;
         }
      }
   }
}

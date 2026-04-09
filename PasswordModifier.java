import java.util.Scanner;

public class PasswordModifier {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String userPassword;
      String newPassword = "";
      char nextChar;
      
      userPassword = sc.next();
      
      for (int i=0; i<userPassword.length(); ++i){
         nextChar = userPassword.charAt(i);
         if (nextChar == 'i'){
            newPassword += '!';
         } else if (nextChar == 'a'){
            newPassword += '@';
         } else if (nextChar == 'm'){
            newPassword += 'M';
         } else if (nextChar == 'B'){
            newPassword += '8';
         } else if (nextChar == 'o'){
            newPassword += '.';
         } else {
            newPassword += nextChar;
         }
      }
      newPassword += "q*s";
      System.out.println(newPassword);
      sc.close();
         
   }
}

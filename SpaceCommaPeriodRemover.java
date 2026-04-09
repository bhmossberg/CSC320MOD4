import java.util.Scanner;

public class SpaceCommaPeriodRemover {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String userText;
      int count = 0;
      char c;
      userText = sc.nextLine();
      
      for (int i = 0; i < userText.length(); ++i){
         c = userText.charAt(i);
         if ((c == ' ') || (c == '.') || (c == ',')) {
            continue;
         }
         else {
            ++count;
         }
      }
      System.out.println(count);
   }
}

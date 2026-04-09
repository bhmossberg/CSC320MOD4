import java.util.Scanner;

public class CountDown {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int userNum;
      userNum = sc.nextInt();
      if ((userNum >= 11) && (userNum <=100)){
         while (true){
            System.out.print(userNum + " ");
            if (userNum % 11 == 0){
               System.out.println();
               break;
            }
            else{
               --userNum;
            }
         }
      }
      else{
         System.out.println("Input must be 11-100");
      }

      sc.close();
   }
}

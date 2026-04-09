import java.util.Scanner;

public class IncrementPrintDoWhile {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int lowNum = sc.nextInt();
      int highNum = sc.nextInt();
      if (lowNum<=highNum) {
         do  {
            System.out.print(lowNum + " ");
            lowNum+=10;
         } while (lowNum <= highNum);
         System.out.println();
      }
      else {
         System.out.println("Second integer can't be less than the first.");
      }
      sc.close();
      
   }
}

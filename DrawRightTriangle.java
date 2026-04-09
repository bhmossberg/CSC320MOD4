import java.util.Scanner; 

public class DrawRightTriangle {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char triangleChar;
      int triangleHeight;
      int count = 0;
      String leg = "";
      System.out.println("Enter a character:");
      triangleChar = scnr.next().charAt(0);   
      
      System.out.println("Enter triangle height:");
      triangleHeight = scnr.nextInt();
      System.out.println();
      while (count < triangleHeight){
         leg += (triangleChar + " ");
         System.out.println(leg);
         ++count;
      }
   }
}
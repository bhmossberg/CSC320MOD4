import java.util.Scanner;

public class NestedLoopExample {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);      
      System.out.print("Enter number of rows: ");
      int numRows = sc.nextInt();
      System.out.print("Enter maximum value: ");
      int userMax = sc.nextInt();
      // Outer loop iterates for fix number of rows
      for (int row = 1; row <= numRows; row++) {
         System.out.print("Row " + row + ": ");
         int column = 1;
         // Inner while loop is required because it must iteratively check for a condition rather than a number of iterations
         while (true) {                      
            int product = row * column;            
            if (product > userMax) { // this is a dynamic break condition
                break;
            }            
            if (product % 2 == 0) {
                System.out.print(product + " ");
            }            
            column++;
         }         
         System.out.println();
      }
      
      sc.close();
   }
}
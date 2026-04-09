import java.util.Scanner; 

public class SystemOfLinearEquationsSolver {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      /* user inputs six numbers for the x coefficients, y coefficients, and totals
      of two linear equations. if the equations are 8x + 7y = 38 and 3x - 5y = -1
      the user inputs "8 7 38 3 5 -1" and the x and y values that solve both 
      equations are printed as "[x] [y]" */
      int xCoeff1 = sc.nextInt();
      int yCoeff1 = sc.nextInt();
      int total1 = sc.nextInt();
      int xCoeff2 = sc.nextInt();
      int yCoeff2 = sc.nextInt();
      int total2 = sc.nextInt();
      // range of x and y values to attempt to solve for
      int xMin = -10;
      int xMax = 10;
      int yMin = -10;
      int yMax = 10;
      // boolean flag to print 'No Solution' message
      boolean solution = false;
      // brute force check of every x and y value in range 
      for (int x = xMin; x <= xMax ; ++x){
         for (int y = yMin ; y <= yMax ; ++y) {
            // verify if x and y values also solve second equation
            if (((xCoeff1 * x) + (yCoeff1 * y) == total1) && ((xCoeff2 * x) + (yCoeff2 * y) == total2)) {
               System.out.println(x + " " + y);
               solution = true;
            }
         }
      }
      if (!solution){
         System.out.println("No solution");
      }
      sc.close();
   }
}

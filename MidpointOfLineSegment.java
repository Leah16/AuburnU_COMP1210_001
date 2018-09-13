import java.util.Scanner;

/**
 * A program to find determine the midpoint of a line
 * segment given the x and y coordinates for the two 
 * end points of the line segment.
 *
 * Project 2
 * @author leah16   COMP 1210-001
 * @version 2018/09/04
 */
 
public class MidpointOfLineSegment
{
   /**
    * Helpping people to find the midpoint. 
    * @param args Command line arguments – not used.
    */
    
   public static void main(String[] args)
   {
   
      Scanner userInput = new Scanner(System.in);
      double x1 = 0;
      double y1 = 0;
      double x2 = 0;
      double y2 = 0;
      
   
      //printing the frist guide line.
      System.out.println("Enter the coordinates for endpoint 1: ");
   
      //Asking for (x1, y1).
      System.out.print("\tx1 = ");
      x1 = userInput.nextDouble();
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();
   
      //Asking for another point.
      System.out.println("Enter the coordinates for endpoint 2: ");
      System.out.print("\tx2 = ");
      x2 = userInput.nextDouble();
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
   
      //Printing one blank line.
      System.out.println();
   
      //Finding the value that we want.
      
      double xMid = (x1 + x2) / 2;
      double yMid = (y1 + y2) / 2;
      
      System.out.print("For endpoints (" + x1 + ", " + y1 
         + ") and (" + x2 + ", " + y2 + "), ");
      System.out.print("the midpoint is (" + xMid
         + ", " + yMid + ").");
   }
}

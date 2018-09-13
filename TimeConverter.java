import java.util.Scanner;

/**
 * A program to convert time unit.
 *
 * Project 2
 * @author Shuangchen Zhou    COMP 1210-001
 * @version 2018/09/04
 */
 
public class TimeConverter
{
   /**
    * A converter about the time. 
    * @param args Command line arguments – not used.
    */
    
   public static void main(String[] args)
   {
   
      Scanner userInput = new Scanner(System.in);
      int sec = 0;
      
      
      //Asking for a time in second.
      System.out.print("Enter the raw time measurement in seconds: ");
      sec = userInput.nextInt();
      
      //Checking the time is vaild or not.
      if (sec < 0) {
         System.out.print("Measurement must be non-negative!");
      }
      else { //If vaild
         System.out.println();
         System.out.println("Measurement by combined days, "
            + "hours, minutes, seconds: ");
      
         int days = sec / 86400;
         int hours = (sec - days * 86400) / 3600;
         int min = (sec - days * 86400 - hours * 3600) / 60;
         int secLeft = sec - days * 86400 - hours * 3600 - min * 60;
      
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + min);
         System.out.println("\tseconds: " + secLeft);
         System.out.println();
         System.out.println(sec + " seconds = " + days + " days, "
            + hours + " hours, "
            + min + " minutes, " + secLeft + " seconds");
      
      }
   }
}
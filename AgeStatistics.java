import java.util.Scanner;

/**
 * A program to help user to find their age and max heart rate.
 *
 * Activity 2
 * @author Shuangchen Zhou    COMP 1210-001
 * @version 2018/09/03
 */

public class AgeStatistics
{
   /**
    * Helpping users to calculate their personal data. 
    * @param args Command line arguments – not used.
    */

   public static void main(String[] args) 
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
   
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age to minutes:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      //convert age to centuries:
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
         
      //display max heart rate
      System.out.print("Your max heart rate is ");
       
      if (gender == 1) { //calculate female MHR  
         System.out.print(209 - (0.7 * ageInYears));
      }
      else { //Calculate male MHR
         System.out.print(214 - (0.8 * ageInYears));
      }
         
      System.out.println(" beats per minute.");
   }  
   
}

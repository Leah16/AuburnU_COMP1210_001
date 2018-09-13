//Import package
import java.util.Scanner;
 
/**
 * A program to convert different kinds of msg.
 *
 * Activity 3
 * @author leah16
 * @version 
 */

public class MessageConverter 
{
   /**
    * Helpping users to covert msg type. 
    * @param args Command line arguments – not used.
    */

   public static void main(String[] args) 
   {
      //Set the variables.
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType = 0;
      String result = "";
       
      //Ask for message from user.
      System.out.print("Type in a message and press enter:\n\t>");
      message = userInput.nextLine();

      //Ask for ideal type for the msg.
      System.out.print("\nOutput types:"
          + "\n\t0: As is "
          + "\n\t1: Trimmed"
          + "\n\t2: lower case"
          + "\n\t3: UPPER CASE"
          + "\n\t4: v_w_ls r_pl_c_d"
          + "\n\t5: Without first and last character"
          + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());

      //Use if to achieve our goal
      if (outputType == 0)
      { // as is
         result = message;
      }
      else if (outputType == 1)
      { // Trimmed
         result = message.trim();
      }
      else if (outputType == 2) 
      { // lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3)
      { // upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4)
      { // replace vowels
         result = message.replace("a", "_");
         result = result.replace("e", "_");
         result = result.replace("i", "_");
         result = result.replace("o", "_");
         result = result.replace("u", "_");
      }
      else if (outputType == 5)
      { // Without f and l charater
         result = message.substring(1, message.length() - 1);
      }
      else
      { // invalid input
         result = "Error: Invalid choice input.";
      }

      //add last line
      System.out.println("\n" + result);

   }
}

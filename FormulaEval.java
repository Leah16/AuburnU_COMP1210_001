import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * A program to use the formula.
 *
 * Project 3
 * @author Shuangchen Zhou    COMP 1210-001
 * @version 2018/09/12  ver.1.0
 */
 
public class FormulaEval
{
   /**
    *  
    * @param args Command line arguments – not used.
    */
    
   public static void main(String[] args)
   {
      //Setting variables    
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double result = 0;
      String numbers;
   
      //Prints the frist line 
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();

      //Using the formula
      result = ((1000 * x + Math.sqrt(Math.abs(3.9 * Math.pow(x, 5)
         - Math.pow(x, 3) + 1)))
         / (1.6 * Math.pow(x, 2) + 2.7 * x + 3.8));
      System.out.print("Result: " + result);
   
      //Convert the types of variable
      numbers = Double.toString(result);
   
      //Set two others
      int numbersLeft;
      int numbersRight;
   
      int index = numbers.indexOf('.');
      String numberL = numbers.substring(0, index);
      String numberR = numbers.substring(index + 1, numbers.length());
      numbersLeft = numberL.length();
      numbersRight = numberR.length();
      
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0####");
      System.out.println();
      System.out.println("# of characters to left of decimal point: " 
         + numbersLeft);
      System.out.println("# of characters to right of decimal point: " 
         + numbersRight);
      System.out.println("Formatted Result: " + fmt1.format(result));
  
   
   }
}

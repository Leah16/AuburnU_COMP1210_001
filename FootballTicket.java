import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * A program to help people find ticket infomation.
 *
 * Project 3
 * @author Shuangchen Zhou    COMP 1210-001
 * @version 2018/09/12  ver.1.0
 */
 
public class FootballTicket
{
   static final double STUDENT_DISCOUNT = 0.67;
   static final double FACULTY_STAFF_DISCOUNT = 0.20;
   /**
    * Prints infomation from ticket.
    * @param args Command line arguments – not used.
    */
     
   public static void main(String[] args)
   {
      //variables
      Scanner userInput = new Scanner(System.in);
      String ocode;
      String code;
      DecimalFormat fmt1 = new DecimalFormat("$###.00");
      //Asking for the number of ticket.
      System.out.print("Enter your ticket code: ");
      ocode = userInput.nextLine();
      code = ocode.trim();
      System.out.println();
   
      if (code.length() < 25) { //invalid code
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least 25 characters.");
      }
      
      else { //infomation parts (variables)
     
         char category;
         double priceFront;
         double priceBehind;
         double price;
         
         category = code.charAt(0);
         priceFront = Double.parseDouble(code.substring(1, 4));
         priceBehind = Double.parseDouble(code.substring(4, 6));
         price = priceFront + priceBehind / 100;
         
         String hr = code.substring(6, 8);
         String min = code.substring(8, 10);
         
         String seat = code.substring(18, 20);
         String row = code.substring(20, 22);
         
         String section;
         String sectionPolice = code.substring(22, 23);
         String zero = "0";
         if (sectionPolice.equals(zero)) {
            section = code.substring(23, 24);
         }
         else {
            section = code.substring(22, 24);
         } 
                 
         String gd = code.substring(24);
         
         String month = code.substring(10, 12);
         String day = code.substring(12, 14);
         String year = code.substring(14, 18);

         
         //random
         int prize;
         Random gen = new Random();
         prize = gen.nextInt(9999999) + 1;
         
         //Apply for discount
         double cost;
      
         if (category == 'f') { //staff
            cost = price * (1 - FACULTY_STAFF_DISCOUNT);
         } 
         else if (category == 's') { //student
            cost = price * (1 - STUDENT_DISCOUNT);
         } 
         else { //normal
            cost = price;
         }
         
         //prints infomation
         System.out.print("Game: " + gd);
         System.out.print("   Date: " + month + "/" + day + "/" + year);
         System.out.println("   Time: " + hr + ":" + min);
         System.out.print("Section: " + section);
         System.out.print("   Row: " + row);
         System.out.println("   Seat: " + seat);
         System.out.print("Price: " + fmt1.format(price));
         System.out.print("   Category: " + category);
         System.out.println("   Cost: " + fmt1.format(cost));
         System.out.print("Prize Number: " + prize);
         
         
      
      }
   }
}

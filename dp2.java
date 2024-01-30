import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
         monthInt = 00;
      }
      
      return monthInt;
   }
   
   // Create a single shared Scanner for keyboard input
   private static Scanner scnr = new Scanner( System.in );

   public static void main(String[] args) {
      //Scanner scnr = new Scanner(System.in);
      // TODO: output in m/d/yyyy format
      String formattedDate = new String();
      String str = new String(scnr.nextLine());//Read dates from input
      //ArrayList<String> dateParse = new ArrayList<String>();
      
      //Parse the dates to find the one in the correct format
      //Splits the string on spaces
      for (String retval: str.split(" ")) {
         dateParse.add(retval);
      }
      
      /*while (String str != "-1"){
         //Splits the string on spaces
         for (String retval: str.split(" ")) {
            dateParse.add(retval);
         }
         System.out.println(dateParse);
         System.out.println(str);
      }*/
      System.out.println(str);
   }
}

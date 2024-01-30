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

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String str = new String();
      String strDate = new String();
      int quit = 0;
      int month = 0;
      String day = "";
      
      while (quit != -1 && scnr.hasNextLine()){         
         if (str != "-1"){
            str = scnr.nextLine();//Gets user input
            if (str != "-1"){
               String[] arrOfStr = str.split(" ", 5); //Parse string into an array
               month = getMonthAsInt(arrOfStr[0]);
               if (month > 0){                  
                  if (arrOfStr[1].contains(",")) {
                     day = arrOfStr[1].substring(0, arrOfStr[1].length()-1);
                     if (arrOfStr[2].length() == 4){
                        strDate = (month + "/" + day + "/" + arrOfStr[2]);
                        System.out.println(strDate);
                     }                     
                  }                  
               }
            }
         }
         else {
            quit = -1;
            break;
         }
      }
   }
}

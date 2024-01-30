import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int totalChangeAmt;
      int dollars = 0;
      int quarters = 0;
      int dimes = 0;
      int nickels = 0;
      int pennies = 0;
      
      totalChangeAmt = scnr.nextInt();
      
      if (totalChangeAmt > 0){// Checks to see if change is due.
         // Count Dollars
         if ((totalChangeAmt / 100 > 0)){
            dollars = totalChangeAmt / 100;
            
            if (dollars > 1){
               System.out.println(dollars + " Dollars");
            }
            else{
               System.out.println(dollars + " Dollar");
            }
            
            totalChangeAmt = totalChangeAmt - (dollars * 100); 
         }
         
         // Count Quarters
         if ((totalChangeAmt / 25 > 0)){
            quarters = totalChangeAmt / 25;
            
            if (quarters > 1){
               System.out.println(quarters + " Quarters");
            }
            else{
               System.out.println(quarters + " Quarter");
            }
            
            totalChangeAmt = totalChangeAmt - (quarters * 25); 
         }
         
         // Count Dimes
         if ((totalChangeAmt / 10 > 0)){
            dimes = totalChangeAmt / 10;
            
            if (dimes > 1){
               System.out.println(dimes + " Dimes");
            }
            else{
               System.out.println(dimes + " Dime");
            }
            
            totalChangeAmt = totalChangeAmt - (dimes * 10); 
         }
         
         // Count Nickels
         if ((totalChangeAmt / 5 > 0)){
            nickels = totalChangeAmt / 5;
            
            if (dimes > 1){
               System.out.println(nickels + " Nickels");
            }
            else{
               System.out.println(nickels + " Nickel");
            }
            
            totalChangeAmt = totalChangeAmt - (nickels * 5); 
         }
         
         // Count Pennies
         if ((totalChangeAmt / 1 > 0)){
            pennies = totalChangeAmt / 1;
            
            if (dimes > 1){
               System.out.println(pennies + " Pennies");
            }
            else{
               System.out.println(pennies + " Penny");
            }
            
            totalChangeAmt = totalChangeAmt - (pennies * 1); 
         }
      }
      else{
         System.out.println("No change");
      }
   }
}

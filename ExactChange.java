import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {int dollars, quarters, dimes, nickels, pennies;
		
		Scanner scnr = new Scanner(System.in);
		int total_change_amount = scnr.nextInt();
		
		dollars = 0;
		quarters = 0;
		dimes = 0;
		nickels = 0;
		pennies = 0;

		//Determine if change is needed
		if (total_change_amount == 0) {
			System.out.println("No change");
		}		    
		else {
			//Count dollars
		    if ((total_change_amount / 100) > 0) {
		    	dollars = total_change_amount / 100;
		    		    			
		        if (dollars > 1) {
		        	System.out.println(dollars + " Dollars");
		        }
		        else if (dollars == 1){
		        	System.out.println(dollars + " Dollar");
		        }
		        total_change_amount = total_change_amount - (dollars * 100);
		    }	
	    	
		    //Count quarters
		    if ((total_change_amount / 25) > 0) {
		    	quarters = total_change_amount / 25;
		    		    			
		        if (quarters > 1) {
		        	System.out.println(quarters + " Quarters");
		        }
		        else if (quarters == 1){
		        	System.out.println(quarters + " Quarter");
		        }
		        total_change_amount = total_change_amount - (quarters * 25);
		    }
	    	
		    //Count dimes
		    if ((total_change_amount / 10) > 0) {
		    	dimes = total_change_amount / 10;
		    		    			
		        if (dimes > 1) {
		        	System.out.println(dimes + " Dimes");
		        }
		        else if (dimes == 1){
		        	System.out.println(dimes + " Dime");
		        }
		        total_change_amount = total_change_amount - (dimes * 10);
		    }
		    
		    //Count nickels
		    if ((total_change_amount / 5) > 0) {
		    	nickels = total_change_amount / 5;
		    		    			
		        if (nickels > 1) {
		        	System.out.println(nickels + " Nickels");
		        }
		        else if (nickels == 1){
		        	System.out.println(nickels + " Nickel");
		        }
		        total_change_amount = total_change_amount - (nickels * 5);
		    }
		    
		    //Count pennies
		    if ((total_change_amount / 1) > 0) {
		    	pennies = total_change_amount / 1;
		    		    			
		        if (pennies > 1) {
		        	System.out.println(pennies + " Pennies");
		        }
		        else if (pennies == 1){
		        	System.out.println(pennies + " Penny");
		        }
		        total_change_amount = total_change_amount - (pennies * 1);
		    }
		}
   }
}

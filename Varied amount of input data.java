import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      // Create variables
	  int number, i, max, avg, sum;
      int[] numList;
	  
      // Creates the objects
      Scanner scnr = new Scanner(System.in);
		            
      // Checks for greater than -1 and builds the list.
	  for (i = 0; i > -1; ++i){
		  // Get the user's number
		  number = scnr.nextInt();
		  // Add to the list of numbers
		  numList[i] = number;
	  }
	  
	  // Closes the objects
      scnr.close();
	  
	  // Gets the maximum number
	  max = 0;
	  for (i = 0; i < numList.length; ++i){
		  if (numList[i] > max){
			  max = numList[i];
		  }
		  
	  }
	  
	  // Calculates the average
	  avg = 0; 
	  sum = 0;
	  for (i = 0; i < numList.length; ++i){
		  sum = sum + numList[i];
		  avg = avg / i;		  
	  }
	  
	  // Print the results
	  System.out.println(avg, max);
    
   }
}

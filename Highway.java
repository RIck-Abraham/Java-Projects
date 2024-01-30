import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
	   int highwayNumber;
	   int primaryNumber;
	
	   highwayNumber = scnr.nextInt();
      
      //Checks for valid highway	  
	   if (highwayNumber < 1 || highwayNumber > 999){
	    	System.out.println(highwayNumber + " is not a valid interstate highway number.");
	    }
	    //Checks for primary highway
	    else if (highwayNumber < 100) {
	    	//Checks direction
	    	if (highwayNumber % 2 == 0) {
	    		System.out.println("I-" + highwayNumber + " is primary, going east/west.");	    		
	    	}
	    	else {
	    		System.out.println("I-" + highwayNumber + " is primary, going north/south.");
	    	}
	    }
	    //Auxiliary highway
	    else {
	       //Gets primary highway
	       String str = String.valueOf(highwayNumber);
	       char ch1 = str.charAt(1);
	       char ch2 = str.charAt(2);
	       String str1 = String.valueOf(ch1);
	       String str2 = String.valueOf(ch2);
	       primaryNumber = Integer.parseInt(str1 + str2); 
	       
	       //Checks Direction
	       if (primaryNumber % 2 == 0) {
	          System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber +  ", going east/west.");	    		
	    	 }
	    	 else {
	    	    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
	    	}
	    }   
   }
}

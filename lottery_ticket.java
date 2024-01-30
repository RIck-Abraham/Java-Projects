import java.util.Scanner;
import java.util.Random;
import java.io.*; 



public class Lottery {
	// Lottery Ticket Method
	static int[] makeLotteryTicket(boolean random){
			// Create the objects
			Scanner scnr = new Scanner(System.in); 
			Random rand = new Random();
			
			// Declare variables
			int[] ticket;
			int maxNumber = 56;//Maximum lottery numbers
			
			// Checks for Quick Picks
			if (random == True){
				// Gets 5 random ticket numbers
				for(int i = 0; i < 5; i++){
					ticket[i] = rand.nextInt(maxNumber);
				}
				
				return ticket[];
			}
			else{
				// Gets the ticket numbers from the user
				System.out.print("1st Number: ");
				ticket[0] = scnr.nextline();
				System.out.print("2nd Number: ");
				ticket[1] = scnr.nextline();
				System.out.print("3rd Number: ");
				ticket[2] = scnr.nextline();
				System.out.print("4th Number: ");
				ticket[3] = scnr.nextline();
				System.out.print("5th Number: ");
				ticket[4] = scnr.nextline();
				
				return ticket[];
			}					
		}
	
	// Main Program
	public static void main(String[] args) {
		// Create an input object
		Scanner scnr = new Scanner(System.in); 
		
		// Declare variables
		int numberOfTickets = 0;
		boolean randomize = True;
		int[] myTicket;
		
		// Gets the user inputs
		System.out.print("How many tickets?");
		numberOfTickets = scnr.nextline();
		System.out.print("Do you want Quick Picks:");
		randomize = scnr.nextline();
		
		// Checks the Number of Tickets
		if (numberOfTickets == 0){
			System.out.print("Goodbye!");// 0 = Quit
		}
		else if (numberOfTickets > 0) && (numberOfTickets < 2){
			// Prints a Single Ticket
			myTicket[] = makeLotteryTicket(randomize);
			System.out.print(myTicket[]);
		}
		else {
			// Prints Multiple Tickets
			for(int i = 0; i < numberOfTickets; i++){// Gets the correct number of tickets
				myTicket[] = makeLotteryTicket(randomize)
				System.out.print(myTicket[]);
			}
		}
	}		
}

import java.util.Scanner;
import java.io.*; 

public class SignIn {
	public static void main(String[] args) {
		// Create an input object
		Scanner scnr = new Scanner(System.in); 
		// Declare variables
		string username, password, set_password, set_username; 
		
		// Gets the user inputs
		System.out.print("Username:");
		username = scnr.nextline();
		System.out.print("Password:");
		password = scnr.nextline(); 
		
		// Set Username & Password
		set_password = "Passw0rd";
		set_username = "JohnDoe";	
		
		// Checks password
		if (password == set_password) and (username.toLowerCase() == set_username.toLowerCase()){
			System.out.print("Hello World");
		}
		else{
			System.out.print("Invalid username or password");
		}
	}		
}

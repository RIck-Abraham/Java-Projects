import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		int z = scnr.nextInt();
		
		scnr.close();

		if (x < y && x < z){
			System.out.println(x);
		}
		else if (y < x && y < z){
			System.out.println(y);
		}
		else{
			System.out.println(z);
		}
   }
}

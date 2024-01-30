import java.util.Scanner;

public class DrivingCosts {

	public static void main(String[] args) {

	      double mpg, price, twenty, seventy_five, one_hundred;

	      Scanner scnr = new Scanner(System.in);
	      mpg = scnr.nextDouble();
	      price = scnr.nextDouble();	     
	      scnr.close();
			
	      twenty = (20 / mpg) * price;
	      seventy_five = (75 / mpg) * price;
	      one_hundred = (500 / mpg) * price;
			
	      System.out.printf("%.2f", twenty);
	      System.out.printf(" %.2f", seventy_five);
	      System.out.printf(" %.2f", one_hundred);
	      System.out.println();
	}

}

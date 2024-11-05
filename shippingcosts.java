/**
 * @author: Rehan Saleem
 * Chapter 3
 * This program needed if/else statements to function. I needed to import scanner as inputs were involved.
 **/
import java.util.Scanner;
public class shippingcosts {
	
	public static void main (String args [])
	
	{
		//I need to create a scanner here, then make an area to input the info. I also need to make that info into a variable (as a double)
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter package weight: ");
		double weight = scan.nextDouble();
		
		//now I need to use an if statement to find the cost based on the weight (with the given info)
		double cost;     //This variable represents the cost  
		
		if (weight < 5)
		{
			cost = 1.2;
		}
		else if (5 < weight && weight <= 10)
		{
			cost = 1;
		}
		else if (10 < weight && weight <= 20)
		{
			cost = 0.9;
		}
		else
		{
			cost = 0.8;
		}
      
		System.out.print("Your package weight is " + weight + " pounds, and the cost of shipping is $" + cost);
		
	}

}

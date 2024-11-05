/**
 * @author: Rehan Saleem

 * Chapter 3
 * This program needed if/else statements to function to display grades. I needed to import scanner as inputs were involved.
 **/
import java.util.Scanner;
public class grades {
	
	public static void main (String args [])
	
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number grade: ");    //typical creation of scanners
		int grade = scan.nextInt();
		
		char letterGrade;  //need to make a character variable for the actual letter grades.
		
		//here is the if statement, startign with the A range, then go down each time until the rest is considered an F.
		if (grade >= 90)
		{
			letterGrade = 'A';
		}
		else if (grade >= 80)
		{
			letterGrade = 'B';
		}
		else if (grade >= 70)
		{
			letterGrade = 'C';
		}
		else if (grade >= 60)
		{
			letterGrade = 'D';
		}
		else
		{
			letterGrade = 'F';
		}
		
		System.out.print(grade + " is graded as a: " + letterGrade);  //I need to print out both the letter and number grade. 
		
	}

}

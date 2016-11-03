import java.util.Scanner;

/**
 * 
 */

/**
 * @author haidan.meadows
 *Mr. Hardman
 *Java assignment 1, project 1
 *10/26/2016
 */
public class GradeAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		double mark1;
		double mark2;
		double mark3;
		double mark4;
		double mark5;
		
		System.out.println("What are your 5 marks?");
		
		System.out.println("Mark 1:");
		mark1 = userInput.nextDouble();
		
		System.out.println("Mark 2:");
		mark2 = userInput.nextDouble();
		
		System.out.println("Mark 3:");
		mark3 = userInput.nextDouble();
		
		System.out.println("Mark 4:");
		mark4 = userInput.nextDouble();
		
		System.out.println("Mark 5:");
		mark5 = userInput.nextDouble();
		
		double average = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
		
		System.out.println(String.format("%10s %10f%%", "Mark  1:", mark1) );
		System.out.println(String.format("%10s %10f%%", "Mark  2:", mark2) );
		System.out.println(String.format("%10s %10f%%", "Mark  3:", mark3) );
		System.out.println(String.format("%10s %10f%%", "Mark  4:", mark4) );
		System.out.println(String.format("%10s %10f%%", "Mark  5:", mark5) );
		System.out.println(String.format("%10s %10f%%", "Average:", average));
		
		
		
	}

}

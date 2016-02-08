/**
 * @author: nasimodilov
 * Author: Nasim Odilov
 * Date: 2/8/2016
 */
import java.util.Scanner; //import the Scanner utility

public class AverageOfNumbers { //setting a public class 

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); //setting an input
		
		System.out.println("Enter ten numbers: "); //setting up an entering line for console
		
		double	number0 = input.nextDouble(); //creating an input line to calculate the average of ten numbers
		double	number1 = input.nextDouble();
		double	number2 = input.nextDouble();
		double	number3 = input.nextDouble();
		double	number4 = input.nextDouble();
		double	number5 = input.nextDouble();
		double	number6 = input.nextDouble();
		double	number7 = input.nextDouble();
		double	number8 = input.nextDouble();
		double	number9 = input.nextDouble();
		
		double average = (number0 + number1 + number2 + number3  + number4 + number5 + number6 + number7 + number8 + number9) /10; //total avrage calculation line
		
		System.out.println("The average of ten numbers" + number0 + " " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7 + " " + number8 + " " + number9 + " is " + average);
		//the final line of showing the average number of an input of ten numbers
	}

}

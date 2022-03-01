import java.util.*;
import java.lang.*;

public class ComputerMethods5026211178{

	// converting Fahrenheit to Celcius
	public  double fToC(double degreesF){
		
		float degreeC = (float)5 / 9 ; 
		double result = degreeC * (degreesF - 32);
		System.out.println("Temp in celcius is " + result);
		return degreeC;

	} 

	// Calculating Hypotenuse length 
	public  double hypotenuse(int a, int b){
		
		double c = Math.sqrt((a*a)+ (b*b));
		System.out.println("Hypotenuse is " + c);
		return c;

	} 

	// sum of two 6-sided rolling dice 
	public int roll(){
		Random randNum = new Random();
		int d1 = randNum.nextInt(6) + 1;
		int d2 = randNum.nextInt(6) + 2;
		int sumd = d1 + d2;
		System.out.println("The sum of the dice values is "+ sumd);
		return sumd;
		
	}
}
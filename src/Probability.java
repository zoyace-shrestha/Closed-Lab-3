import java.util.Random;
import java.util.Scanner;

public class Probability 
{

	public static void main(String[] args) 
	{

		//Decalration of contructors
		Scanner scan = new Scanner ( System.in);
		Scanner scan2 = new Scanner ( System.in);
		Random rand = new Random();
		
		//Asking step
		System.out.println("Guess the roll");
		int g = scan.nextInt();
		System.out.println("");
		
		//Roll for two dice
		
		int d1 = rand.nextInt(6) + 1;
		int d2 = rand.nextInt(6) + 1;
		int t1 = d1 + d2 ;
		System.out.println("The output for first roll is " + t1);
		System.out.println( "Dice one rolled: " + d1 + " & " + "Dice two rolled: " + d2);
		
		
		if ( g == 2 || g == 12)
		{
			System.out.println("The probablitly of getting " + g + " is " + ".0278");
		}
		
		else if ( g == 3 || g == 11)
		{
			System.out.println("The probablitly of getting " + g + " is " + ".0555");
		}
		
		else if ( g == 4 || g == 10 )
		{
			System.out.println("The probablitly of getting " + g + " is " + ".0232");
		}
		
		else if ( g == 5 || g == 9)
		{
			System.out.println("The probablitly of getting " + g + " is " + ".0456");
		}
		
		else if ( g == 6 || g == 8)
		{
			System.out.println("The probablitly of getting " + g + " is " + ".0324");
		}
		
		else if ( g == 7)
		{
			System.out.println("The probablitly of getting " + g + " is " + ".0368");
		}
		
		System.out.println();
		
		String s = "$";
		System.out.print("What is your wager : ");
		int w = scan2.nextInt();
		System.out.println("You bet the value of "  + w + s + " either you take " + w*2 + s + " or lose " + w + s);
		
		
		int d3 = rand.nextInt(6) + 1;
		int d4 = rand.nextInt(6) + 1;
		System.out.println("Dice roll are: " + d3 + "and" + d4);
	    int t2 = d3 + d4 ;
	    System.out.println ("The roll is " + t2);
	    
	    if ( g == t2 )
	    {
	    	System.out.println("You won " + w*2 + s);
	    }
	    
	    else  
	    {
	    	System.out.println("You lost  " + w);
	    }
		
	}

}

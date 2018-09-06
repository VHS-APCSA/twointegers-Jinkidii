import java.util.Scanner;

public class TwointRunner 
{

	public static void main(String [] args)
	{
		
		Scanner input = new Scanner ( System.in );
		System.out.print( "Enter a number : ");
		int value  = input.nextInt();
		Twoint ti = new Twoint(value);
		int num = ti.getNum();

	}
}

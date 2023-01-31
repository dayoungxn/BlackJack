package class220328;
import static java.lang.System.*;
import java.awt.Color;


public class CardTestOne_220325_Dayoung {
	public static void main( String args[] )
	{
		Card_220325_Dayoung one = new BlackJackCard_220325_Dayoung();
		out.println(one);

		Card_220325_Dayoung two = new BlackJackCard_220325_Dayoung(1,"DIAMONDS");
		out.println(two);

		Card_220325_Dayoung three = new BlackJackCard_220325_Dayoung(4,"CLUBS");
		out.println(three);
		
		Card_220325_Dayoung four = new BlackJackCard_220325_Dayoung(12,"SPADES");
		out.println(four);
	
		Card_220325_Dayoung five = new BlackJackCard_220325_Dayoung(12,"HEARTS");
		out.println(five);	
		
		Card_220325_Dayoung six = new BlackJackCard_220325_Dayoung(9,"SPADES");
		out.println(six);				

		out.println(one.equals(two));
		out.println(one.equals(one));		
		out.println(four.equals(five));	
		out.println(three.equals(four));						
	}
}

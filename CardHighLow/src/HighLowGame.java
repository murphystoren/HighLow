import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class HighLowGame
{
	static ArrayList <Card> yeet = new ArrayList <Card>();


	public static void main(String[] args)


{


welcome();


defineCards();


shuffleDeck();


playgame();


}


	public static void welcome()


{


	System.out.println("Wlecome to High&Low!");

	System.out.println( "The dealer will flip over the first card on the deck.");

	System.out.println("You then will guess if the next card flipped over will be higher,");

	System.out.println("lower, or equal to the current one.");

	System.out.println("If you guess correct, you will receive plus one point.");

	System.out.println("If you guess wrong though, you will loose one point.");

}


	public static void defineCards()


{


	yeet.add(new Card ("Ace", "Hearts" ,1));


	yeet.add(new Card ("Two", "Hearts" ,2));


	yeet.add(new Card ("Three", "Hearts",3));


	yeet.add(new Card ("Four", "Hearts" ,4));


	yeet.add(new Card ("Five", "Hearts" ,5));


	yeet.add(new Card ("Six", "Hearts" ,6));


	yeet.add(new Card ("Seven", "Hearts", 7));


	yeet.add(new Card ("Eight", "Hearts", 8));


	yeet.add(new Card ("Nine", "Hearts", 9));


	yeet.add(new Card ("Ten", "Hearts", 10));


	yeet.add(new Card ("Jack", "Hearts", 11));


	yeet.add(new Card ("Queen", "Hearts", 12));


	yeet.add(new Card ("King", "Hearts", 13));


	yeet.add(new Card ("Ace", "Diamonds" ,1));


	yeet.add(new Card ("Two", "Diamonds" ,2));


	yeet.add(new Card ("Three", "Diamonds",3));


	yeet.add(new Card ("Four", "Diamonds" ,4));


	yeet.add(new Card ("Five", "Diamonds" ,5));


	yeet.add(new Card ("Six", "Diamonds" ,6));


	yeet.add(new Card ("Seven", "Diamonds", 7));


	yeet.add(new Card ("Eight", "Diamonds", 8));


	yeet.add(new Card ("Nine", "Diamonds", 9));


	yeet.add(new Card ("Ten", "Diamonds", 10));


	yeet.add(new Card ("Jack", "Diamonds", 11));


	yeet.add(new Card ("Queen", "Diamonds", 12));


	yeet.add(new Card ("King", "Diamonds", 13));


	yeet.add(new Card ("Ace", "Clubs" ,1));


	yeet.add(new Card ("Two", "Clubs" ,2));


	yeet.add(new Card ("Three", "Clubs",3));


	yeet.add(new Card ("Four", "Clubs" ,4));


	yeet.add(new Card ("Five", "Clubs" ,5));


	yeet.add(new Card ("Six", "Clubs" ,6));


	yeet.add(new Card ("Seven", "Clubs", 7));


	yeet.add(new Card ("Eight", "Clubs", 8));


	yeet.add(new Card ("Nine", "Clubs", 9));


	yeet.add(new Card ("Ten", "Clubs", 10));


	yeet.add(new Card ("Jack", "Clubs", 11));


	yeet.add(new Card ("Queen", "Clubs", 12));


	yeet.add(new Card ("King", "Clubs", 13));


	yeet.add(new Card ("Ace", "Spades" ,1));


	yeet.add(new Card ("Two", "Spades" ,2));


	yeet.add(new Card ("Three", "Spades",3));


	yeet.add(new Card ("Four", "Spades" ,4));


	yeet.add(new Card ("Five", "Spades" ,5));


	yeet.add(new Card ("Six", "Spades" ,6));


	yeet.add(new Card ("Seven", "Spades", 7));


	yeet.add(new Card ("Eight", "Spades", 8));


	yeet.add(new Card ("Nine", "Spades", 9));


	yeet.add(new Card ("Ten", "Spades", 10));


	yeet.add(new Card ("Jack", "Spades", 11));


	yeet.add(new Card ("Queen", "Spades", 12));


	yeet.add(new Card ("King", "Spades", 13));


}


	public static void shuffleDeck()


{


	Collections.shuffle(yeet);


}


	public static void playgame()

{

	int counter=0;

	for (int i =0; i<yeet.size(); i++)

{

	System.out.println("Will the next card be higher, lower, or equal to a " + yeet.get(i).getRank()+ " of " + yeet.get(i).getSuit() + "?");

	Scanner userInput = new Scanner (System.in);

	String answer = userInput.nextLine();

{

	if (answer.equals ("higher"))

{

	if (yeet.get(i).getValue()<yeet.get(i+1).getValue()) 

{

	counter++;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit()+ ".");

	System.out.println("You won. Your score is now " + counter +".");

}

	else if (yeet.get(i).getValue()>yeet.get(i+1).getValue())

{

	counter --;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit() + ".");

	System.out.println("You lost. It was lower. Your score is now " + counter + " .Try again please.");

}

	else if (yeet.get(i).getValue()==yeet.get(i+1).getValue())

{

	counter --;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit() + ".");

	System.out.println("You lost. It was the same value. Your score is now " +counter + " . Try again.");

}

}

	else if (answer.equals ("lower"))

{

	if (yeet.get(i).getValue()>yeet.get(i+1).getValue()) 

{

	counter++;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit()+".");

	System.out.println("You won. Nice job! Your score is now " + counter + ".");

}

	else if (yeet.get(i).getValue()<yeet.get(i+1).getValue())

{

	counter--;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit()+".");

	System.out.println("You lost. It was higher. Your score is now " +counter + " . Better luck next time.");

}

	else if (yeet.get(i).getValue()==yeet.get(i+1).getValue())

{

	counter --;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit()+".");

	System.out.println("You lost. It was the same value. Your score is now " +counter + " . Guess again.");

}

}

	else if (answer.equals("equal to"))

{

	if (yeet.get(i).getValue()==yeet.get(i+1).getValue())

{

	counter ++;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit()+".");

	System.out.println("You won. Good job. Your score is now " + counter + ".");

}

	else if (yeet.get(i).getValue()>yeet.get(i+1).getValue())

{

	counter --;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit()+".");

	System.out.println("You lost. The card was lower. Your score is now " +counter + " . Try again please.");

}

	else if (yeet.get(i).getValue()<yeet.get(i+1).getValue())

{

	counter --;

	System.out.println("The card was a " + yeet.get(i+1).getRank()+ " of " + yeet.get(i+1).getSuit()+".");

	System.out.println("You lost. The card was higher. Your score is now " +counter + " . Try again.");

}

}

}

}

}

}

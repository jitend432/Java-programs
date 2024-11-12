import java.util.Scanner;
public class Cardsuffle {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your choice : ");
		int pickacard = input.nextInt();
		String[] decks = {"clubs","diamond","hearts","spades"};
		String[] cards = {"A","2","3","4","5","6","7","8","9","10","Q","K","J"};
		
		 int pickedDeck = (int)(Math.random() * decks.length);
		 int pickedCard = (int)(Math.random() * cards.length);
		System.out.println("your card is : " + pickedCard + " and Deck is " + decks[pickedDeck]);
	}
} 
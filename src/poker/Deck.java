package poker;

// Need the random number generator
import java.util.Random;
import java.util.ArrayList;

// A deck of cards simple has cards
public class Deck {
	private ArrayList<Card> cards;
	public static final int numOfTotalCards = 52;
	
	// Initialize deck ( with 52 unique cards )
	public Deck (){
		this.cards = new ArrayList<Card>(numOfTotalCards);
		Card card;
		int i = 0;
		for (Suit suit : Suit.values()){
			for (Value value : Value.values()){
				card  = new Card(suit, value);
				this.cards.add(i, card);
				i++;
			}
		}
	}
	
	// Returns the number of cards left in deck
	public int numOfCards(){
		return this.cards.size();
	}
	
	// Returns and remove a card from the deck
	public Card removeCard(int index){
		Card card = this.cards.get(index);
		return card != null ? this.cards.remove(index) : null;
	}
	
	/*
	 * Simple algorithm 
	 * for each card 
	 *   switch its place to a random place anywhere from 0 to 52
	 */
	public void suffle (){
		for (int i = 0; i < numOfTotalCards; i++ ){
			Random rand = new Random();
			int min = 0,
				max = numOfTotalCards - 1;
			int randomPos = rand.nextInt(max - min + 1) + min;

			this.swapCardsInDeck(i, randomPos);
		}
	}
	
	// A simple private helper method to swap card positions in the deck
	private void swapCardsInDeck( int posOne, int posTwo ){
		Card temp = this.cards.get(posOne);
		this.cards.add(posOne, this.cards.get(posTwo));
		this.cards.add(posTwo, temp);
	}
	
	// A toString method for easy printing
	public String toString(){
		String print = "";
		for (int i = 0; i < numOfTotalCards; i++){
			print = print + this.cards.get(i).toString() + "\n"; 
		}
		return print;
	}
}

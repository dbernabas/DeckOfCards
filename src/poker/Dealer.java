package poker;

import java.util.Random;

// A dealer has a deck of cards
public class Dealer {
	
	private Deck deck;
	private int callsMade;
	// Initialize dealer
	public Dealer(Deck deck){
		this.deck = deck;
		this.callsMade = 0;
	}
	
	// Shuffle cards  in deck
	public void shuffle(){
		this.deck.shuffle();
	}
	
	// Deck Getter
	public Deck getDeck(){
		return this.deck;
	}
	// If there are cards left in the deck, return a random card from the deck
	public Card dealOneCard(){
		//this.deck.getCards().trimToSize();
		if (this.callsMade > 51) {
			assert this.callsMade == Deck.numOfTotalCards;
			return null;
		}
		Random rand = new Random();
		int min = 0,
			max = (Deck.numOfTotalCards - this.callsMade) - 1 ;
		int randomPos = rand.nextInt(max - min + 1) + min;
		this.callsMade++;
		return this.deck.removeCard(randomPos); 
	}
}

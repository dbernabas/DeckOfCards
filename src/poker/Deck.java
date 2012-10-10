package poker;

// Need the random number generator
import java.util.Random;
import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck (){
		this.cards = new ArrayList<Card>(52);
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
	

	public void suffle (){
		for (int i = 0; i < 52; i++ ){
			Random rand = new Random();
			int min = 0,
				max = 51;
			int randomPos = rand.nextInt(max - min + 1) + min;

			this.swapCardsInDeck(i, randomPos);
		}
	}
	
	private void swapCardsInDeck( int posOne, int posTwo ){
		Card temp = this.cards.get(posOne);
		this.cards.add(posOne, this.cards.get(posTwo));
		this.cards.add(posTwo, temp);
	}
	
	public String toString(){
		String print = "";
		for (int i = 0; i < 52; i++){
			print = print + this.cards.get(i).toString() + "\n"; 
		}
		return print;
	}
}

package poker;

// A card has a suit
// A card has a face value
public class Card {
	public enum Suit { 
		HEART,
		SPADE,
		CLUB,
		DIAMOND 
	}
	public enum Value {
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING
	}

	private Suit suit;
	private Value value;
	
	// Initialize card
	public Card(Suit suit, Value value){
		this.setSuit(suit);
		this.setValue(value);
	}
	
	// Suit Getter
	public Suit getSuit(){
		return this.suit;
	}
	
	// Value Getter
	public Value getValue(){
		return this.value;
	}
	
	// Suit Setter
	public void setSuit(Suit suit){
		this.suit = suit;
	}
	
	// Value Setter
	public void setValue(Value value){
		this.value = value;
	}
	
	// print
	public String toString(){
		return "Suit: " + this.suit + " -- Value: "  + this.value;
	}
}

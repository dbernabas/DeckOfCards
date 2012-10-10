package poker;

public class Card {
	
	private Suit suit;
	private Value value;
	
	
	public Card(Suit suit, Value value){
		this.setSuit(suit);
		this.setValue(value);
	}
	
	public Suit getSuit(){
		return this.suit;
	}
	public Value getValue(){
		return this.value;
	}
	public void setSuit(Suit suit){
		this.suit = suit;
	}
	public void setValue(Value value){
		this.value = value;
	}
	
	public String toString(){
		return "Suit: " + this.suit + " -- Value: "  + this.value;
	}
}

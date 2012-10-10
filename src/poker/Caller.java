package poker;

import java.util.ArrayList;

// Caller is a single player 
// A caller has some cards in hand
// A caller has a name :)

public class Caller {
	private ArrayList<Card> cards;
	private String name = "";
	
	// Initialize caller
	public Caller (String name){
		this.cards = new ArrayList<Card>();
		this.name = name;
	}
	
	// Name Setter
	public void setName(String name){
		this.name = name;
	}
	
	// Name Getter
	public String getName(){
		return this.name;
	}

	// Tell Dealer to deal one card
	public void call (Dealer dealer){
		Card card = dealer.dealOneCard();
		if (card != null) {
			System.out.println(card);
			this.cards.add(card);
		}
	}
	
	// Return all cards that this caller has
	public ArrayList<Card> getCards(){
		return this.cards;
	}
	
	public String toString(){
		String print = "";
		for(int i = 0; i < this.cards.size(); i++){
			print = print + this.cards.get(i).toString() + " \n";
		}
		return print;
	}
}

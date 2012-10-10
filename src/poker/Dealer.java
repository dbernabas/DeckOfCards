package poker;

import java.util.Random;

public class Dealer {
	private Deck deck;
	private int cardsDealt;
	
	public Dealer(Deck deck){
		this.deck = deck;
		cardsDealt = 0;
	}
	
	public void suffle(){
		this.deck.suffle();
	}
	
	public void dealOneCard(){
		Random rand = new Random();
		int min = 0,
			max = 51;
		int randomPos = rand.nextInt(max - min + 1) + min;
		
	}
}

import poker.*;

import java.util.ArrayList;

public class Game {
	public static void main (String [] args){
		Dealer dealer = new Dealer(new Deck());
		Caller caller1 = new Caller("bernabas");
		Caller caller2 = new Caller("valdis");
		
		// Shuffle the deck of cards
		Deck d = dealer.getDeck();
		//System.out.println(d);
		//System.out.println(" -- Shuffling cards -- \n");

		dealer.shuffle();
		int i = 0;
		
		while (true){
			if (i % 2 == 0){
				caller1.call(dealer);
			} else {
				caller2.call(dealer);
			}
			
			if (i > 54){
				break;
			}
			i++;
		}
		System.out.println(caller1);
		System.out.println(" -- Return cards -- ");
		System.out.println(caller2);
		System.out.println(" --  caller 1 -- ");
		System.out.println(caller1.getCards().size());
		System.out.println(" --  caller 2 -- ");
		System.out.println(caller2.getCards().size());
	}
}

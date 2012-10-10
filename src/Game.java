import poker.*;

public class Game {
	public static void main (String [] args){
		Dealer dealer = new Dealer(new Deck());
		Caller bernabas = new Caller("bernabas");
		Caller valdis = new Caller("valdis");
		Caller randomDude = new Caller("randomDude");
		
		
		// Before Shuffle
		// System.out.println(dealer);
		dealer.shuffle();
		// After Shuffle
		// System.out.println(dealer);
		int i = 0;
		int m = 0;
		while (true){
			
			switch(i){
			case 0:
			  bernabas.call(dealer);
			  break;
			case 1:
			  valdis.call(dealer);
			  break;
			case 2:
			  randomDude.call(dealer);
			  break;
			}
			i = nextInt(i);
			//System.out.println(m);
			if (m > 51){
				break;
			}
			m++;
		}
		System.out.println(bernabas);
		System.out.println(valdis);
		System.out.println(randomDude);
	}
	private static int nextInt(int i){
		switch(i){
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 0;
		}
		return 0;
	}
}

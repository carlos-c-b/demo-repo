package cards;
import cards.Card;

public class Deck {
	private static Card[] cards = new Card[52];

	public Deck() {
		int i = 0;
		for (Card.Suit s : Card.Suit.values())
			for (Card.Rank r : Card.Rank.values())
				cards[i++] = new Card(s, r);
	}

}

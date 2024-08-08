package cards;

public class Card {
	public enum Suit {
		DIAMONDS, CLUBS, HEARTS, SPADES
	}
	
	public enum Rank {
		ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	private final Suit suit;
	private final Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public Rank getRank() {
		return rank;
	}
}

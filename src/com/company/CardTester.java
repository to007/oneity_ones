package com.company;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card x = new Card("Three", "Spades", 3);
		Card y = new Card("Three", "Spades", 2);
		System.out.println(x.suit());
		System.out.println(x.rank());
		System.out.println(x.pointValue());
		System.out.println(x.matches(y));
		System.out.println(x.toString());
	}
}

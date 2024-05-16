package com.lingarogroup.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void canGetValueOfCardTwo() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card1.getValue());
    }

    @Test
    void canGetValueOfCardEight() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.EIGHT);
        assertEquals(8, card1.getValue());
    }

    @Test
    void canGetValueOfCardKing() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.KING);
        assertEquals(10, card1.getValue());
    }

    @Test
    void canGetValueOfCardAce() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.ACE);
        assertEquals(1, card1.getValue());
    }

    @Test
    void cardPrintsSuitAndValue() {
        Card card1 = new Card(Suit.SPADES, Rank.KING);
        assertEquals("KING \u2660", card1.toString());
    }
}
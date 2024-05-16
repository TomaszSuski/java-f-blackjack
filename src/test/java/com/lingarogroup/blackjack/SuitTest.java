package com.lingarogroup.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {
    @Test
    void heartPrintsHeart() {
        assertEquals("♥", Suit.HEARTS.toString());
    }

    @Test
    void heartValueIsHeartChar() {
        assertEquals('♥', Suit.HEARTS.getSymbol());
    }
}
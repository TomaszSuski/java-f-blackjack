package com.lingarogroup.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @Test
    void getValueOfKing() {
        assertEquals(10, Rank.KING.getValue());
    }
}
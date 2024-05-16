package com.lingarogroup.blackjack;

public enum Suit {
    CLUBS('♣'),
    DIAMONDS('♦'),
    HEARTS('♥'),
    SPADES('♠');

    private final char symbol;

    Suit(Character symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return Character.toString(symbol);
    }
}

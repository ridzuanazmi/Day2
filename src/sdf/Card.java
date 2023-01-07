package sdf;

public class Card {
    
    // Members
    private Integer value;
    private String suit;
    private String name;

    public Card(String suit, Integer value, String name) {
        this.suit = suit;
        this.value = value;
        this.name = name;

    }
    public Integer getValue() {
        return value;
    }
    public String getSuit() {
        return suit;
    }
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Card {name: %s, suit: %s, value: %s}".formatted(name, suit, value);
    }
    
        
}

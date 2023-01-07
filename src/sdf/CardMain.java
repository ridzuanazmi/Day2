package sdf;

public class CardMain {
    
    public static void main(String[] args) {
        
        Deck deck = new Deck();
        System.out.printf("\n>> before shuffling: %s\n", deck);

        deck.shuffle();

        System.out.println();
        System.out.printf(">> after shuffling: %s\n", deck);

    }
}

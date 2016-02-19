package models;

/**
 * Created by Jacob on 2/16/2016.
 */
public class StandardGame extends Game{

    public void buildDeck(){
            for(int i = 2; i < 15; i++){
                deck.add(new Card(i,Suit.Clubs));
                deck.add(new Card(i,Suit.Hearts));
                deck.add(new Card(i,Suit.Diamonds));
                deck.add(new Card(i,Suit.Spades));
            }
    }
}

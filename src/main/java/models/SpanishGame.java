package models;

/**
 * Created by grejucv on 2/16/2016.
 */
public class SpanishGame extends Game {

    public void buildDeck(){
        for(int i = 1; i<11;i++){
            deck.add(new Card(i, Suit.Coins));
            deck.add(new Card(i, Suit.Cups));
            deck.add(new Card(i, Suit.Swords));
            deck.add(new Card(i, Suit.Clubs));
        }
    }
}
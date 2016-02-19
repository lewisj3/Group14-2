package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lewisj3 on 2/16/16.
 */
public class testSpanishGame {

    @Test
    public void testGameCreation(){
        SpanishGame g = new SpanishGame();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        assertEquals(40,g.deck.size());
    }

    @Test
    public void testGameInit(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(2,g.deck.get(0).getValue());
        assertNotNull(g.scoreBoard);
    }

    @Test
    public void testGameStart(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        assertEquals(1,g.cols.get(0).size());
        assertEquals(1,g.cols.get(1).size());
        assertEquals(1,g.cols.get(2).size());
        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testCustomDeal(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        System.out.println("Custom Deal: " + g.cols.get(0).get(0).toString() + " " + g.cols.get(1).get(0).toString() + " " + g.cols.get(2).get(0).toString() + " "+ g.cols.get(3).get(0).toString());
        assertEquals("2Clubs",g.cols.get(0).get(0).toString());
        assertEquals("3Clubs",g.cols.get(1).get(0).toString());
        assertEquals("4Clubs",g.cols.get(2).get(0).toString());
        assertEquals("5Clubs",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testRemoveFunction(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }



}

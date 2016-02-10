package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by drewhamm on 2/2/16.
 */
public class testScoreBoard {

    @Test
    public void testScoreBoardCreation(){
        ScoreBoard s = new ScoreBoard();
        assertNotNull(s);
        s = new ScoreBoard(10);
        assertNotNull(s);
    }

    @Test
    public void testScoreBoardGetScore(){
        ScoreBoard s = new ScoreBoard();
        assertTrue(s.getScore() == 0);
        s = new ScoreBoard(10);
        assertTrue(s.getScore() == 10);
    }

    @Test
    public void testScoreBoardAddPoint(){
        ScoreBoard s = new ScoreBoard();
        assertTrue(s.getScore() == 0);
        s.addPoint();
        assertTrue(s.getScore() == 1);
    }

    @Test
    public void testScoreBoardReset(){
        ScoreBoard s = new ScoreBoard(10);
        s.reset();
        assertTrue(s.getScore() == 0);
    }

    @Test
    public void testScoreBoardToString(){
        ScoreBoard s = new ScoreBoard(10);
        assertTrue(s.toString().equals("10"));
    }
}

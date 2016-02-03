package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by drewhamm on 2/2/16.
 */

public class ScoreBoard implements Serializable {
    private int score;

    @JsonCreator
    public ScoreBoard(@JsonProperty("score") int score) {
        this.score = score;
    }

    @JsonCreator
    public ScoreBoard() {
        this.score = 0;
    }

    public int getScore(){
        return score;
    }

    public void addPoint(){
        score++;
    }

    public void reset(){
        score = 0;
    }

    public String toString(){
        return Integer.toString(score);
    }
}

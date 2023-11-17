package com.fbep.FBEP.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/*
 * Auxiliar class to make 2 PK into one
 * for matching in Belonging.java
*/
@Embeddable
public class BelongingPK {
    
    /*
     * Global Attributes
    */
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "gamelist_id")
    private GameList gameList;

    /*
     * Constructors
    */
    public BelongingPK() {
    }
    public BelongingPK(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    /*
     * Getters
    */
    public Game getGame() {
        return game;
    }
    public GameList getGameList() {
        return gameList;
    }

    /*
     * Setters
    */
    public void setGame(Game game) {
        this.game = game;
    }
    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gameList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        BelongingPK other = (BelongingPK) obj;
        return Objects.equals(game, other.game) && Objects.equals(gameList, other.gameList);
    }
}

package com.fbep.FBEP.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity /* Instantiating the 'Game Entity' table in dataBase. */
@Table(name = "tb_belonging") /* Setting the name table. */
public class Belonging {
    
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer gamePosition;

    public Belonging() {
    }
    public Belonging(Game game, GameList gameList, Integer gamePosition) {

        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.gamePosition = gamePosition;
    }

    public BelongingPK getId() {
        return id;
    }
    public Integer getGamePosition() {
        return gamePosition;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }
    public void setGamePosition(Integer gamePosition) {
        this.gamePosition = gamePosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        return Objects.equals(id, ((Belonging) obj).id);
    }
}

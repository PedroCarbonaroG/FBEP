package com.fbep.FBEP.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_gamelist")
public class GameList {
    
    /*
     * Global attributes
    */
    @Id /* Starting at database as an id primaryKey */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* Setting the autoincrement value in each record of this id */
    private short id;
    private String name;

    public GameList() {
    }
    public GameList(short id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
     * Getters
    */
    public short getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    /*
     * Setters
    */
    public void setId(short id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    /*
     * HashCode Method
    */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /*
     * Equals Method
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        return Objects.equals(id, ((GameList) obj).id);
    }
}

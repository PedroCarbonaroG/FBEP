/*
 * Class Dependencies
*/
package com.fbep.FBEP.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * @NOTATIONS:
 * This project is a project for beginners, so all parts 
 * of the code will be commented for future studies and 
 * reviews to solidify knowledge and practice.
*/

/*
 * Game entitie
*/
@Entity /* Instantiating the 'Game Entity' table in dataBase. */
@Table(name = "tb_game") /* Setting the name table. */
public class Game {
    
    /*
     * Global Game Attributes
    */
    @Id /* Setting in the table that this attribute is a primary key 'Id'. */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* Setting autoincrement in this attribute table. */
    private short id;

    private String title;
    private String genre;
    private String platforms;
    private String imgUrl;

    @Column(columnDefinition = "TEXT") /* Defining in the table that this column containing this field is 
    defined as text to support texts longer than varChar which only supports 255 characters. */
    private String shortDescription;

    /* Defining in the table that this column containing this field is 
    defined as text to support texts longer than varChar which only supports 255 characters. */
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    @Column(name = "game_year") /* Setting the 'game year' name in table, because the word 'year'
    is an reserved keyWord in SQL, so needs to change for another name.*/
    private Integer year;

    private Double score;

    /*
     * Constructors
    */
    public Game() {
    }
    public Game(short id, String title, Integer year, String genre, String platforms,
    Double score, String imgUrl, String shortDescription, String longDescription) {
        /*
         * Setting attributes
        */
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.year = year;
        this.score = score;
    }

    /*
     * Getters
    */
    public short getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getPlatforms() {
        return platforms;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    public String getLongDescription() {
        return longDescription;
    }
    public Integer getYear() {
        return year;
    }
    public Double getScore() {
        return score;
    }

    /*
     * Setters
    */
    public void setId(short id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public void setScore(Double score) {
        this.score = score;
    }

    // @Override
    // public String toString() {
    //     return
    //     "Id: " + this.getId() + 
    //     "Title: " + this.getTitle() + 
    //     "Genre: " + this.getGenre() + 
    //     "Platforms: " + this.getPlatforms() + 
    //     "ImgUrl: " + this.getImgUrl() + 
    //     "ShortDescription: " + this.getShortDescription() +
    //     "longDescription: " + this.getLongDescription() +
    //     "Year: " + this.getYear() + 
    //     "Score: " + this.getScore() +
    //     "\n\n"
    //     ;
    // }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }
}

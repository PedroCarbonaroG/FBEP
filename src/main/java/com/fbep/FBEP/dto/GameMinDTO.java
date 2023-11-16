/*
 * Class Dependencies
*/
package com.fbep.FBEP.dto;

import com.fbep.FBEP.entities.Game;

/*
 * DTO class
*/
public class GameMinDTO {
    
    /*
     * Attributes
    */
    private short id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    /*
     * Constructors
    */
    public GameMinDTO() {
        /*
         * Empty constructor
        */
    }
    public GameMinDTO(Game entity) {
        /*
         * Constructor with fields
        */
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
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
    public Integer getYear() {
        return year;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getShortDescription() {
        return shortDescription;
    }

}

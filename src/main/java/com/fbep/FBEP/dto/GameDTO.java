package com.fbep.FBEP.dto;

import com.fbep.FBEP.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    private short id;

    private String title;
    private String genre;
    private String platforms;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
    private Integer year;
    private Double score;

    public GameDTO() {
    }
    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

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
}

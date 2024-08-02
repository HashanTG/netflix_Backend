package com.netflixclone.register.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class tvshow {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tv_show_id;
    private String title;
    private String description ;
    private String released_date;
    private String genre;
    private String duration;
    private String cast;
    private String country;
    private String production;
    private double IMDB_ration;
    private String imgPosterURL;

    public tvshow() {
    }

    public int getTvShow_id() {
        return tv_show_id;
    }

    public void setTvShow_id(int tv_show_id) {
        this.tv_show_id = tv_show_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleased_date() {
        return released_date;
    }

    public void setReleased_date(String released_date) {
        this.released_date = released_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public double getIMDB_ration() {
        return IMDB_ration;
    }

    public void setIMDB_ration(double IMDB_ration) {
        this.IMDB_ration = IMDB_ration;
    }

    public String getImgPosterURL() {
        return imgPosterURL;
    }

    public void setImgPosterURL(String imgPosterURL) {
        this.imgPosterURL = imgPosterURL;
    }
}

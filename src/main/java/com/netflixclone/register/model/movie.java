package com.netflixclone.register.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class movie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_id;
    private String title;
    private String description ;
    private String released_date;
    private String genre;
    private String duration;
    private String cast;
    private String country;
    private String production;
    private double IMDB_ration;
    private String videoURL;

    public movie() {
    }


    private int getMovie_id() {
        return movie_id;
    }

    private void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
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

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }
}

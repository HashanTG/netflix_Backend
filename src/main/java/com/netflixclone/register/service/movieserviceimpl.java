package com.netflixclone.register.service;

import com.netflixclone.register.model.movie;

import com.netflixclone.register.repository.movierepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieserviceimpl implements movieservice{


    @Autowired
    private movierepository movierepo;

    @Override
    public movie savemovie(movie movie) {
        return movierepo.save(movie);
    }

    @Override
    public List<movie> getmovie() {
        return movierepo.findAll();
    }
}

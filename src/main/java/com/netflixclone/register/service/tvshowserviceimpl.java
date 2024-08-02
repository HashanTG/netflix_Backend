package com.netflixclone.register.service;

import com.netflixclone.register.model.movie;

import com.netflixclone.register.model.tvshow;
import com.netflixclone.register.repository.movierepository;

import com.netflixclone.register.repository.tvshowrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tvshowserviceimpl implements tvshowservice{


    @Autowired
    private tvshowrepository tvshowrepo;

    @Override
    public tvshow savetvshow(tvshow tvshow) {
        return tvshowrepo.save(tvshow);
    }

    @Override
    public List<tvshow> gettvshow() {
        return tvshowrepo.findAll();
    }
}

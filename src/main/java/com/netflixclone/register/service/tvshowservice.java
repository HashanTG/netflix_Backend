package com.netflixclone.register.service;


import com.netflixclone.register.model.tvshow;


import java.util.List;

public interface tvshowservice {

    public tvshow savetvshow(tvshow tvshow);

    public List<tvshow> gettvshow();
}

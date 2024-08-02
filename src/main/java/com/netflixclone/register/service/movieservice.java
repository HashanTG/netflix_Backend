package com.netflixclone.register.service;

import com.netflixclone.register.model.movie;


import java.util.List;

public interface movieservice {

    public movie savemovie(movie movie);

    public List<movie> getmovie();
}

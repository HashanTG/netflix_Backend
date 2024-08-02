package com.netflixclone.register.controller;


import com.netflixclone.register.model.movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.netflixclone.register.service.movieservice;


import java.util.List;

@RestController
@RequestMapping("/movie")
public class moviecontroller {
    @Autowired
    private movieservice movieservie;

    @PostMapping("/add")
    public String addMovie(@RequestBody movie movie) {
        movieservie.savemovie(movie);
        return "success";
    }

    @GetMapping("/getAll")
    public List<movie> getAllMovie() {


        return movieservie.getmovie();
    }




}

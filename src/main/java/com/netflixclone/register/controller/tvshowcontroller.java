package com.netflixclone.register.controller;


import com.netflixclone.register.model.tvshow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.netflixclone.register.service.tvshowservice;


import java.util.List;

@RestController
@RequestMapping("/tvshow")
public class tvshowcontroller {
    @Autowired
    private tvshowservice tvshowservice;

    @PostMapping("/add")
    public String addMovie(@RequestBody tvshow tvshow) {
        tvshowservice.savetvshow(tvshow);
        return "success";
    }

    @GetMapping("/getAll")
    public List<tvshow> getAllTvshow() {


        return tvshowservice.gettvshow();
    }




}

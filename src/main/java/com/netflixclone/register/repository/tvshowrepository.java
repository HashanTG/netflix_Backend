package com.netflixclone.register.repository;


import com.netflixclone.register.model.tvshow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tvshowrepository extends JpaRepository<tvshow, Integer> {


}

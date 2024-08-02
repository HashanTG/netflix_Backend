package com.netflixclone.register.repository;

import com.netflixclone.register.model.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movierepository extends JpaRepository<movie, Integer> {


}

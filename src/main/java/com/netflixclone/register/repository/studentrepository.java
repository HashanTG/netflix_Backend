package com.netflixclone.register.repository;


import com.netflixclone.register.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepository extends JpaRepository<student, Integer> {


}

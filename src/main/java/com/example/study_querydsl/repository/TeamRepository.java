package com.example.study_querydsl.repository;

import com.example.study_querydsl.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByName(String test);
}

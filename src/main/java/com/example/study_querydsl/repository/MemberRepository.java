package com.example.study_querydsl.repository;

import com.example.study_querydsl.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member,Long>, MemberCustomRepository{

}

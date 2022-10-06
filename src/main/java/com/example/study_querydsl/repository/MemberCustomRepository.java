package com.example.study_querydsl.repository;

import com.example.study_querydsl.entity.Member;

import java.util.List;

public interface MemberCustomRepository {

    List<Member> findAllByTeamId(Long team);

}

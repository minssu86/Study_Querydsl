package com.example.study_querydsl.service;

import com.example.study_querydsl.entity.Member;
import com.example.study_querydsl.entity.Team;
import com.example.study_querydsl.repository.MemberRepository;
import com.example.study_querydsl.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    @Transactional(readOnly = true)
    public List<Member> getMember(String test) {
        Team team = teamRepository.findByName(test);
        return memberRepository.findAllByTeamId(team.getId());
    }

    public List<Team> getTeam() {
        return teamRepository.findAll();
    }

}

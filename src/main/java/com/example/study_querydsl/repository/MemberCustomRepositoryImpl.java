package com.example.study_querydsl.repository;

import com.example.study_querydsl.entity.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.study_querydsl.entity.QMember.member;

@Repository
@RequiredArgsConstructor
public class MemberCustomRepositoryImpl implements MemberCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Member> findAllByTeamId(Long team) {
        return jpaQueryFactory.selectFrom(member)
                .where(member.team.id.eq(team))
                .fetch();
    }
}

package com.example.study_querydsl;

import com.example.study_querydsl.entity.Member;
import com.example.study_querydsl.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @DisplayName("멤버 조회")
    @Test
    void getMember() {

        // Given
        String test = "team4";

        // When
        List<Member> result = userService.getMember(test);

        // Then
        assertThat(result.get(0).getId()).isEqualTo(7);
        assertThat(result.get(1).getId()).isEqualTo(8);
        assertThat(result.get(0).getAge()).isEqualTo(20);
        assertThat(result.get(1).getAge()).isEqualTo(30);
        

    }
}
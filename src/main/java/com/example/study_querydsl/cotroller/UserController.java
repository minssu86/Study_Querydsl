package com.example.study_querydsl.cotroller;

import com.example.study_querydsl.entity.Member;
import com.example.study_querydsl.entity.Team;
import com.example.study_querydsl.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("test")
    public List<Member> getMember(){
        return userService.getMember("team4");
    }

    @GetMapping("test2")
    public List<Team> getTeam(){
        return userService.getTeam();
    }

}

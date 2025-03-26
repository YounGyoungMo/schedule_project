package com.example.schedule_project.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private String task;        // 할일
    private String author;      // 작성자명
    private String password;    // 비밀번호
}


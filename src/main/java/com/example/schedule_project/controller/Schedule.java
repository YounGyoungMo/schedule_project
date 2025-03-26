package com.example.schedule_project.controller;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Schedule {
    private long id;            // ID
    private String task;       // 할일
    private String author;     // 작성자명
    private String password;   // 비밀번호
    private LocalDateTime created_time; // 작성일
    private LocalDateTime updated_time; // 수정일

}

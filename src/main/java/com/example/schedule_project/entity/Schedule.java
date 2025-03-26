package com.example.schedule_project.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Schedule {
    private Long id;

    private String title;
    private String author;
    private String password;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 기본 생성자, 게터/세터
    public Schedule() {
    }

    public Schedule(String title, String author, String password, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.title = title;
        this.author = author;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


}

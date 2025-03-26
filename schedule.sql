CREATE
DATABASE schedule_db;

USE schedule_db;

CREATE TABLE schedules
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '일정 식별자',
    task VARCHAR(255) NOT NULL COMMENT '할일',
    writer VARCHAR(100) NOT NULL COMMENT '작성자',
    password VARCHAR(100) NOT NULL COMMENT '비밀번호',
    created_time DATETIME NOT NULL COMMENT '작성일',
    updated_time DATETIME NOT NULL COMMENT '수정일'
);
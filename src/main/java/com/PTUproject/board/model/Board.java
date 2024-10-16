package com.PTUproject.board.model;

import lombok.Data;

import java.util.Date;

@Data
public class Board {
    private long id;        //게시물ID
    private String writer;  //작성자
    private String title;   //제목
    private String content; //본문내용
    private Date regDate;   //등록일시
    private long hitCount;  //조회수
}

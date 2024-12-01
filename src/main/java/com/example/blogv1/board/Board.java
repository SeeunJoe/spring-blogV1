package com.example.blogv1.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
@NoArgsConstructor //DB에서 조회해서 가져온 RS를 디폴트 생성자를 호출해서 new하고 값을 채워준다.
@Getter
@Table(name="board_tb")
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private Timestamp createdAt;
}

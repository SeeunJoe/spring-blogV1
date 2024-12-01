package com.example.blogv1.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class BoardRepository {

    //JPA는 EntityManager로 DB에 접근한다.
    private final EntityManager em; // native 쿼리....

    public List<Board> findAll() {
        Query q = em.createNativeQuery("select * from board_tb order by id desc",Board.class);

/*        ResultSet rs = em.prepareStatemsnet("쿼리");
        -> ResultSet으로 받는다 : 테이블 형태 그대로 받는다.
        -> 테이블의 row 한 줄이 객체 하나이다.
        -> rs.getContent... 이런식으로 projection 컬럼 뽑아낸다
        -> rs.next - while돌리면서 : 다음 row으로 한칸씩 내가 파싱하며 뽑아내야함
         => 이것들을 다 해주는 게 EntityManager!! Thank you EntityManager
*/
     //   List<Board> list = q.getResultList();  collection으로 받아줌
        // Board list = q.getSingleResult();
     //   return list;
        return q.getResultList();
    }

}

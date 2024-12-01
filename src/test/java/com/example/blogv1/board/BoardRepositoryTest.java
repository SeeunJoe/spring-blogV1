package com.example.blogv1.board;

import org.junit.jupiter.api.AutoClose;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import(BoardRepository.class) // 내가 만들어서 모르기 때문에 import로 띄워
@DataJpaTest // DB와 관련된 자원들을 메모리(IoC)에 올린다. -> 최소한의 메모리로 부분적으로 테스트할 수있다.
public class BoardRepositoryTest {

  @Autowired
  private BoardRepository boardRepository; //이거 해줘야 boardRepository안에 있는 애들 테스트 가능

  // 내가 test하고 싶은 메서드 -> 테스트코드에서는 _사용한다.
  @Test // 자체 스레드 생성 -> main없어도 단독으로 실행가능!
  public void findAll_test(){

    // given (매개변수 넣을 수 없어서 생략)

    // when
    List<Board> boardList = boardRepository.findAll();
    System.out.println();

    //eye
    for(Board board : boardList){
      System.out.println(board.getId());
      System.out.println(board.getTitle());
      System.out.println(board.getContent());
      System.out.println(board.getCreatedAt());
      System.out.println("===================");
    }

  }

}

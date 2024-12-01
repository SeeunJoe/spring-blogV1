package com.example.blogv1.board;

import lombok.Data;

public class BoardResponse {

  // static -> 바로 new할 수 있어
  // static안쓰면 boardResponse.ListDTO해서 써야해

  @Data // getter,setter포함
  public static class DTO{ //board객체에 있는 걸 여기로 옮겨준다.
    private int id;
    private String title;

    public DTO(Board board) {
      this.id = board.getId();
      this.title = board.getTitle();
    }
  }

}
